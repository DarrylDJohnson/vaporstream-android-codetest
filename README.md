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

## appended goals [Darryl Johnson]

* [DONE] Get States in the MainActivityViewModel through dependency injection. In other words, move the network calls and work managers from the ViewModel into the Modules
* [DONE] Simulate AssistedInjection: Observe work started in the viewmodel in the MainActivity through dependency injection. (Google's @AssistedInject has issues in Dagger2 as Hilt is now preferred)

Concerns:
* observeForever, used in the States and User modules, is not tied to an Activity's lifecycle
   - It could be useful to observeForever as it is tied to the Application's lifecycle
     - The LiveData could store a queue of uids which the application can use to update the view with a notification showing a user having been successfully inserted into the UserDatabase (Snackbars?)
     - If, for example, the form were a signin form and the current user needed to be tracked, the current user uid is easily accessible via injection
   - However, the StatesModule does not need to observe the worker info forever. That observer should be removed upon a successful result.
* How does dependency injection affect testability? Can provided values be tested separately or should certain functions exist in the viewmodel for the sake of testability?