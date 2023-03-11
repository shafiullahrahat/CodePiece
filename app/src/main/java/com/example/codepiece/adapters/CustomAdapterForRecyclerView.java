package com.example.codepiece.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codepiece.R;
import com.example.codepiece.activities.FullViewOfCode;
import com.example.codepiece.models.ProblemsTitleAndSolutionsModelClass;

import java.util.List;

public class CustomAdapterForRecyclerView extends RecyclerView.Adapter<CustomAdapterForRecyclerView.MyViewHolder> {

    Context context;
    List<ProblemsTitleAndSolutionsModelClass> problemsTitleAndSolutions;

    public CustomAdapterForRecyclerView(Context context, List<ProblemsTitleAndSolutionsModelClass> problemsTitleAndSolutions) {
        this.context = context;
        this.problemsTitleAndSolutions = problemsTitleAndSolutions;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(context).inflate(R.layout.main_activity_item_list, parent, false);
        return new MyViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String problemName = problemsTitleAndSolutions.get(position).getProblemsTitle();
        String problemSolC = problemsTitleAndSolutions.get(position).getProbSolC();
        String problemSolCpp = problemsTitleAndSolutions.get(position).getProbSolCpp();
        String problemSolJava = problemsTitleAndSolutions.get(position).getProbSolJava();
        String problemSolPython = problemsTitleAndSolutions.get(position).getProbSolPython();
        String algorithms = problemsTitleAndSolutions.get(position).getAlgo();

        holder.textView.setText(problemName);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FullViewOfCode.class);
                intent.putExtra("problemsTitle",problemName);
                intent.putExtra("problemSolC",problemSolC);
                intent.putExtra("problemSolCpp",problemSolCpp);
                intent.putExtra("problemSolJava",problemSolJava);
                intent.putExtra("problemSolPython",problemSolPython);
                intent.putExtra("algorithms",algorithms);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return problemsTitleAndSolutions.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewMainActivity);
        }
    }
}
