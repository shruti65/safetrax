package com.safeinvest.safetrax;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link taskFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class taskFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public taskFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment taskFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static taskFrag newInstance(String param1, String param2) {
        taskFrag fragment = new taskFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_task,container,false);


        Spinner dept=(Spinner)view.findViewById(R.id.deptspinner);
        ArrayAdapter<?> array_Adapter =
                ArrayAdapter.createFromResource(this.getActivity(),R.array.dept,
                        android.R.layout.simple_spinner_item);
        array_Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dept.setAdapter(array_Adapter);


        Spinner cat=(Spinner)view.findViewById(R.id.catspinner);
        ArrayAdapter<?> array_Adapter2 =
                ArrayAdapter.createFromResource(this.getActivity(),R.array.cate,
                        android.R.layout.simple_spinner_item);
        array_Adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       cat.setAdapter(array_Adapter2);


        Spinner task=(Spinner)view.findViewById(R.id.taskspinner);
        ArrayAdapter<?> array_Adapter3 =
                ArrayAdapter.createFromResource(this.getActivity(),R.array.task,
                        android.R.layout.simple_spinner_item);
        array_Adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        task.setAdapter(array_Adapter3);


        Spinner group=(Spinner)view.findViewById(R.id.grpspinner);
        ArrayAdapter<?> array_Adapter4 =
                ArrayAdapter.createFromResource(this.getActivity(),R.array.group,
                        android.R.layout.simple_spinner_item);
        array_Adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       group.setAdapter(array_Adapter4);


        Spinner plans=(Spinner)view.findViewById(R.id.planspinner);
        ArrayAdapter<?> array_Adapter5 =
                ArrayAdapter.createFromResource(this.getActivity(),R.array.plans,
                        android.R.layout.simple_spinner_item);
        array_Adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        plans.setAdapter(array_Adapter5);
        return view;
    }
}