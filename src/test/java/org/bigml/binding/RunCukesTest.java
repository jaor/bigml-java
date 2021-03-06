package org.bigml.binding;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
// @Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report"})
//@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report" }, features = {
//        "src/test/resources/create_prediction_local_ensemble.feature",
//        "src/test/resources/delete_all_dev_data.feature" })
@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report" }, features = {
        "src/test/resources/compare_predictions.feature",
        "src/test/resources/compute_multivote_predictions.feature",
        "src/test/resources/create_anomaly.feature",
        "src/test/resources/create_batch_prediction.feature",
        "src/test/resources/create_batch_prediction_multi_model.feature",
        "src/test/resources/create_evaluation.feature",
        "src/test/resources/create_local_prediction.feature",
        "src/test/resources/create_multi_model.feature",
        "src/test/resources/create_prediction.feature",
        "src/test/resources/create_prediction_dev.feature",
        "src/test/resources/create_prediction_ensemble.feature",
        "src/test/resources/create_prediction_local_ensemble.feature",
        "src/test/resources/create_prediction_multi_model.feature",
        "src/test/resources/create_prediction_public_model.feature",
        "src/test/resources/create_prediction_shared_model.feature",
        "src/test/resources/create_public_dataset.feature",
        "src/test/resources/createPredictionFromLocalModel.feature",
        "src/test/resources/createPredictions.feature",
        "src/test/resources/download_dataset.feature",
        "src/test/resources/download_sample.feature",
        "src/test/resources/missing_and_errors.feature",
        "src/test/resources/projects.feature",
        "src/test/resources/rename_duplicated_names.feature",
        "src/test/resources/sample_dataset.feature",
        "src/test/resources/split_dataset.feature",
        "src/test/resources/inspect_model.feature",
        "src/test/resources/delete_all_dev_data.feature" })
public class RunCukesTest {
}
