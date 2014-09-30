Feature: Create Predictions from Ensembles
    In order to create a prediction from an ensemble
    I need to create an ensemble first

    Scenario Outline: Successfully creating a prediction from an ensemble:
        Given that I use development mode
        Given I create a data source uploading a "<data>" file
        And I wait until the source is ready less than <time_1> secs
        And I add the unitTest tag to the data source waiting less than <time_1> secs
        And I create a dataset
        And I wait until the dataset is ready less than <time_2> secs
        And I create an ensemble of <number_of_models> models and <tlp> tlp
        And I wait until the ensemble is ready less than <time_3> secs
        When I create a prediction with ensemble by name=<by_name> for "<data_input>"
        And I wait until the prediction is ready less than <time_4> secs
        Then the prediction for "<objective>" is "<prediction>"
        Then delete test data
        

	Examples:
        | data             | time_1  | time_2 | time_3 | time_4 | number_of_models | tlp   | by_name   |  data_input    | objective | prediction  |
        | data/iris.csv | 10      | 10     | 50     | 20     | 5                | 1     | true     | {"petal width": 0.5} | 000004    | Iris-setosa |
        