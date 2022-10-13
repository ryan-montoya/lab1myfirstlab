package edu.uw.tcss450.rmonto6.lab1myfirstapp.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.rmonto6.lab1myfirstapp.R;
import edu.uw.tcss450.rmonto6.lab1myfirstapp.databinding.FragmentFirstBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private FragmentFirstBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // instantiate the binding object and Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false);
        mBinding = FragmentFirstBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }


    private void processMessage() {
        final String message = mBinding.editMessage.getText().toString();
        Log.d("MESSAGE",message);
        //Use the ID of the action to access it
       // Navigation.findNavController(getView()).navigate(R.id.action_firstFragment_to_secondFragment);

        FirstFragmentDirections.ActionFirstFragmentToSecondFragment directions =
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(message);

        Navigation.findNavController(getView())
                .navigate(directions);

    }

    @Override
    public void onViewCreated(@NonNull   View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        //Use a Lamda expression to add the OnClickListener
        mBinding.buttonSend.setOnClickListener(button -> processMessage());
    }


}