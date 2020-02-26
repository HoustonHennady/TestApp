package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.di.AppModule;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends DaggerAppCompatActivity {



            NavController navController;


    BottomNavigationView bottomNavigationView;

    private FirebaseAuth firebaseAuth;
    public String TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavMenu);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithEmailAndPassword("houstonhennadzy@gmail.com", "96346151");
        // FIRESTORE

        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        Map<String,Object> collections = new HashMap<>();
        collections.put("CarrWash","CarWash");
        collections.put("Cleaning", "Cleaning");
        CollectionReference reference = firestore.collection("Categories11");
        reference.add(collections);
        DocumentReference documentReference = firestore.collection("Categories").document(
                "I51Bb1Im07GdgamCF2ff"
        );
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()){
                    DocumentSnapshot documentSnapshot = task.getResult();
                    Log.d(TAG,"-------------------------------------------------------------------------------------------------" +
                            "-----------------------------------------------------" +documentSnapshot.getData());
                }
            }
        });





    }

    public class NewCollections{
        NewCollections newCollections;
    }
}
