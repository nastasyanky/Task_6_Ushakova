package sample;

import P_Strateg_R.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    public TextField tx_array;
    public TextField tx_bubble;
    public TextField tx_selection;
    public TextField tx_insertion;
    public Button b_bubble;
    public Button b_selection;
    public Button b_insertion;
    public ListView list_view;
    private Context_R context;
    int n=0;
    ArrayList<String> al =new ArrayList<String>();
    ArrayList<String> al_bubble =new ArrayList<String>();
    ArrayList<String> al_select =new ArrayList<String>();
    ArrayList<String> al_insert =new ArrayList<String>();
    private int[] array_n = new int[7];

    public void on_array(ActionEvent actionEvent) {
        al.clear();
        for (int i = 0; i < array_n.length; i++) {
            array_n[i] = ((int) (Math.random() * 11) + 1);
            al.add(String.valueOf(array_n[i]));
            }
        tx_array.setText(al.toString());
    }
    public void bubbleSort(ActionEvent actionEvent) {
        al_bubble.clear();
        context = new Context_R(new Bubble_Sort_R());
        context.sortArray_R(array_n);
        for(int i = 0; i <  array_n.length; i++) {
            al_bubble.add(String.valueOf(array_n[i]));
        }
        tx_bubble.setText(al_bubble.toString());
        }

    public void selectionSort(ActionEvent actionEvent) {
        al_select.clear();
        context = new Context_R(new Selection_Sort_R());
        context.sortArray_R(array_n);
        for(int i = 0; i <  array_n.length; i++) {
            al_select.add(String.valueOf(array_n[i]));
        }
        tx_selection.setText(al_select.toString());
    }
    public void insertionSort(ActionEvent actionEvent) {
        al_insert.clear();
        context = new Context_R(new Insertion_Sort_R());
        context.sortArray_R(array_n);
        for(int i = 0; i <  array_n.length; i++) {
            al_insert.add(String.valueOf(array_n[i]));
        }
        tx_insertion.setText(al_insert.toString());
    }
}
