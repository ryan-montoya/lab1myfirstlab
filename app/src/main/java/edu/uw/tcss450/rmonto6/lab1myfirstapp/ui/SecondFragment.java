package edu.uw.tcss450.rmonto6.lab1myfirstapp.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.rmonto6.lab1myfirstapp.R;
import edu.uw.tcss450.rmonto6.lab1myfirstapp.databinding.FragmentFirstBinding;
import edu.uw.tcss450.rmonto6.lab1myfirstapp.databinding.FragmentSecondBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private FragmentSecondBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // instantiate the binding object and Inflate the layout for this fragment
       //  return inflater.inflate(R.layout.fragment_second, container, false);
        mBinding = FragmentSecondBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }
   /*
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }


    private void processMessage() {
        final String message = mBinding.editMessage.getText().toString();
        Log.d("MESSAGE",message);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        //Use a Lamda expression to add the OnClickListener
        mBinding.buttonSend.setOnClickListener(button -> processMessage());
    } */

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        //Get a reference to the SafeArgs object
        SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());
        //Set the text color of the label. NOTE no need to cast
        mBinding.textMessage.setText(args.getMessage());
    }
}