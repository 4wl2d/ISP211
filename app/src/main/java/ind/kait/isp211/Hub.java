package ind.kait.isp211;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import ind.kait.isp211.databinding.HubBinding;

public class Hub extends Fragment {

    private HubBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = HubBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Hub.this)
                        .navigate(R.id.action_Hub_to_Monday);
            }
        });

        binding.buttonTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Hub.this)
                        .navigate(R.id.action_Hub_to_Tuesday);
            }
        });

        binding.buttonWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Hub.this)
                        .navigate(R.id.action_Hub_to_Wednesday);
            }
        });

        binding.buttonThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Hub.this)
                        .navigate(R.id.action_Hub_to_Thursday);
            }
        });

        binding.buttonFriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Hub.this)
                        .navigate(R.id.action_Hub_to_Friday);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}