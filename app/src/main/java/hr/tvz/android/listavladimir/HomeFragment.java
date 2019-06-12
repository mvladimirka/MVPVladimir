package hr.tvz.android.listavladimir;

import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(NavigationDrawerConstants.TAG_HOME);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
//public interface OnClickListener {
//    void onClick(ModelClass modelClass);
//}
//
//    private OnClickListener onClickListener = null;
//
//    public void setOnClickListener(OnClickListener onClickListener) {
//        this.onClickListener = onClickListener;
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        RecyclerView list = view.findViewById(R.id.language_list);
//        list.setLayoutManager(new LinearLayoutManager(this.getContext()));
//
//        final List<ModelClass> items = new ArrayList<>();
//        View.OnClickListener onClick = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (onClickListener != null) {
//                    ModelClass modelClass = (ModelClass) view.getTag();
//                    onClickListener.onClick(modelClass);
//                }
//            }
//        };
//        final RecyclerView.Adapter adapter = new Adapter(items, onClick);
//        list.setAdapter(adapter);
//
//        DataHelper.createService()
//                .getmodelClassList()
//                .enqueue(new Callback<List<ModelClass>>() {
//                    @Override
//                    public void onResponse(Call<List<ModelClass>> call, Response<List<ModelClass>> response) {
//                        List<ModelClass> modelClassList= response.body();
//                        System.out.println("Fetched languages: " + modelClassList);
//                        items.addAll(modelClassList);
//                        adapter.notifyDataSetChanged();
//                    }
//
//                    @Override
//                    public void onFailure(Call<List<ModelClass>> call, Throwable t) {
//                        System.out.println("Failed to fetch languages!");
//                    }
//                });
//
//        return view;
//    }
//
//
//
//}
