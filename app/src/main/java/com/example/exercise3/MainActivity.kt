package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculate.setOnClickListener { cal() }
        buttonReset.setOnClickListener{reset()}
    }

    private fun cal() {
        val age = spinnerAge.selectedItem.toString()
        val gender1 = radioGroupGender.checkedRadioButtonId
        val gender = resources.getResourceEntryName(gender1)

        if (age.equals("Less than 17")) {
            textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 60"))
        } else if (age.equals("17 to 25")) {
            if (gender.equals("radioButtonMale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 70 \nExtra payment for Male: RM 50 \nExtra payment for Smoker: RM 100 \nTotal : RM 220"))
            } else if (gender.equals("radioButtonFemale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 70 \nExtra payment for Smoker: RM 100 \nTotal: RM 170"))
            } else if (gender.equals("radioButtonMale")) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 70\nExtra payment for Male: RM 50 \nTotal : RM 120"))
            } else
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 70"))
        }else if (age.equals("26 to 30")) {
            if (gender.equals("radioButtonMale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 90 \nExtra payment for Male: RM 50 \nExtra payment for Smoker: RM 100 \nTotal : RM 340"))
            } else if (gender.equals("radioButtonFemale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 90 \nExtra payment for Smoker: RM 100 \nTotal: RM 240"))
            } else if (gender.equals("radioButtonMale")) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 90\nExtra payment for Male: RM 50 \nTotal : RM 140"))
            } else
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 90"))
        }else if (age.equals("31 to 40")) {
            if (gender.equals("radioButtonMale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 120 \nExtra payment for Male: RM 150 \nExtra payment for Smoker: RM 200 \nTotal : RM 470"))
            } else if (gender.equals("radioButtonFemale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 120 \nExtra payment for Smoker: RM 200 \nTotal: RM 320"))
            } else if (gender.equals("radioButtonMale")) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 120\nExtra payment for Male: RM 150 \nTotal : RM 270"))
            } else
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 120"))
        }else if (age.equals("41 to 55")) {
            if (gender.equals("radioButtonMale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Male: RM 200 \nExtra payment for Smoker: RM 250 \nTotal : RM 600"))
            } else if (gender.equals("radioButtonFemale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Smoker: RM 250 \nTotal: RM 400"))
            } else if (gender.equals("radioButtonMale")) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150\nExtra payment for Male: RM 200 \nTotal : RM 350"))
            } else
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150"))
        }else if (age.equals("More than 55")) {
            if (gender.equals("radioButtonMale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Male: RM 200 \nExtra payment for Smoker: RM 300 \nTotal : RM 650"))
            } else if (gender.equals("radioButtonFemale") && checkBoxSmoker.isChecked) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Smoker: RM 300 \nTotal: RM 450"))
            } else if (gender.equals("radioButtonMale")) {
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150\nExtra payment for Male: RM 200 \nTotal : RM 350"))
            } else
                textViewPremium.setText(String.format("Insurance Premium:\nPrice: RM 150"))
        }
    }
    private fun reset(){
        textViewPremium.setText(null)
    }

}




