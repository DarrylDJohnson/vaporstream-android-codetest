## android-codetest

## overview

Refactor a basic form that submits input to a `ResultsActivity` which then displays the input values.

## main project goal

* [DONE] Refactor the project from Java to kotlin and complete the project using kotlin.
* [DONE] Refactor the `MainActivity` and the `ResultsActivity` to use the Google Jetpack `ViewModel`, `Databinding`, and `LiveData` Architecture components.

## extended project goals
(not required to complete - feel free to incorporate any of these)

* [DONE] Setup an architecture framework such as MVVM
* [DONE] Add input validation to the `MainActivity` view model (see validation requirements below).
* [DONE] Enable the Submit button only when all of the input validations pass.
* [DONE] Use `Retrofit2` to pull down the list of US States from [here](https://api.jsonbin.io/b/60770a3c5b165e19f6201b95) and populate the `Spinner` instead of using the provided `states-array`. DONE

## validation requirements

[DONE] First name, Last name, Address, and City should not be empty. Address2 can be empty.

[DONE] Phone should only use numbers, and should validate against a standard US phone (5555555555).

[DONE] The State Spinner should be anything but "Select a State" on submit.

[DONE] Zipcode shouldn't be any longer/shorter than a standard US zip (60601).

## goals++
(not required to complete - using any of the following tools would be a bonus)

* [DONE] Incorporate `Dagger2` where you see fit.
* [DONE] Use `Room` to save the user input to an `android_code_test` database on submission, and retrieve the data back to display.
* [DONE] Use `WorkManager` to queue up your database and/or networking jobs.