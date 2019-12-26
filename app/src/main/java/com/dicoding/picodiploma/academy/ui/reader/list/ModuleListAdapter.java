package com.dicoding.picodiploma.academy.ui.reader.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.picodiploma.academy.R;
import com.dicoding.picodiploma.academy.data.ModuleEntity;
import com.dicoding.picodiploma.academy.ui.detail.DetailCourseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ModuleListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final MyAdapterClickListener listener;
    private List<ModuleEntity> modules = new ArrayList<>();

    ModuleListAdapter(MyAdapterClickListener listener) {
        this.listener = listener;
    }

    void setModules(List<ModuleEntity> modules) {
        if (modules == null) return;
        this.modules.clear();
        this.modules.addAll(modules);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ModuleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.items_module_list_custom, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int position) {
        ModuleEntity module = modules.get(position);
        ModuleViewHolder moduleViewHolder = (ModuleViewHolder) viewHolder;
        moduleViewHolder.bind(module.getmTitle());
        moduleViewHolder.itemView.setOnClickListener(v -> {
            listener.onItemClicked(viewHolder.getAdapterPosition(), modules.get(moduleViewHolder.getAdapterPosition()).getmModuleId());
        });
    }

    @Override
    public int getItemCount() {
        return modules.size();
    }

    class ModuleViewHolder extends RecyclerView.ViewHolder {
        final TextView textTitle;
        final TextView textLastSeen;

        ModuleViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.text_module_title);
            textLastSeen = itemView.findViewById(R.id.text_last_seen);
        }

        void bind(String title) {
            textTitle.setText(title);
        }
    }
}

interface MyAdapterClickListener {
    void onItemClicked(int position, String moduleId);
}
