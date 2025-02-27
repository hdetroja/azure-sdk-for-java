// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.EarlyTerminationPolicy;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsObjectDetection;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsObjectDetection;
import com.azure.resourcemanager.machinelearning.models.ImageObjectDetection;
import com.azure.resourcemanager.machinelearning.models.ImageSweepSettings;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LearningRateScheduler;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLFlowModelJobInput;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.ModelSize;
import com.azure.resourcemanager.machinelearning.models.ObjectDetectionPrimaryMetrics;
import com.azure.resourcemanager.machinelearning.models.SamplingAlgorithmType;
import com.azure.resourcemanager.machinelearning.models.StochasticOptimizer;
import com.azure.resourcemanager.machinelearning.models.ValidationMetricType;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageObjectDetectionTests {
    @Test
    public void testDeserialize() {
        ImageObjectDetection model =
            BinaryData
                .fromString(
                    "{\"taskType\":\"ImageObjectDetection\",\"primaryMetric\":\"MeanAveragePrecision\",\"modelSettings\":{\"boxDetectionsPerImage\":667354640,\"boxScoreThreshold\":57.01898,\"imageSize\":920278919,\"maxSize\":546709544,\"minSize\":1447146223,\"modelSize\":\"Large\",\"multiScale\":true,\"nmsIouThreshold\":58.316856,\"tileGridSize\":\"sovyxpavidnievw\",\"tileOverlapRatio\":21.210634,\"tilePredictionsNmsThreshold\":54.720806,\"validationIouThreshold\":27.970045,\"validationMetricType\":\"Voc\",\"advancedSettings\":\"puxgcbdsvalpnpt\",\"amsGradient\":true,\"augmentations\":\"xgpazwugxyqv\",\"beta1\":72.82474,\"beta2\":87.86046,\"checkpointFrequency\":953919104,\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"mode\":\"ReadWriteMount\",\"uri\":\"iuhzzgqlmfa\",\"description\":\"z\"},\"checkpointRunId\":\"udjpxpqht\",\"distributed\":true,\"earlyStopping\":false,\"earlyStoppingDelay\":1217471622,\"earlyStoppingPatience\":342924982,\"enableOnnxNormalization\":false,\"evaluationFrequency\":419853623,\"gradientAccumulationStep\":1049447036,\"layersToFreeze\":336351434,\"learningRate\":79.0951,\"learningRateScheduler\":\"None\",\"modelName\":\"uxsp\",\"momentum\":71.59348,\"nesterov\":false,\"numberOfEpochs\":1973063413,\"numberOfWorkers\":1796310561,\"optimizer\":\"Adamw\",\"randomSeed\":1409212705,\"stepLRGamma\":8.159346,\"stepLRStepSize\":99529171,\"trainingBatchSize\":1768553154,\"validationBatchSize\":385248466,\"warmupCosineLRCycles\":70.731415,\"warmupCosineLRWarmupEpochs\":2134877467,\"weightDecay\":72.09128},\"searchSpace\":[{\"boxDetectionsPerImage\":\"axdvwzaehp\",\"boxScoreThreshold\":\"thd\",\"imageSize\":\"mvetatlakfq\",\"maxSize\":\"xwgiks\",\"minSize\":\"vtooxrpo\",\"modelSize\":\"phchgjtnhtukfaci\",\"multiScale\":\"bfntumeezbxvq\",\"nmsIouThreshold\":\"nuvwcgasgomtmjzw\",\"tileGridSize\":\"qgo\",\"tileOverlapRatio\":\"xpwwzt\",\"tilePredictionsNmsThreshold\":\"mkkhtgfredml\",\"validationIouThreshold\":\"grllcc\",\"validationMetricType\":\"ovjowazhpabacom\",\"amsGradient\":\"otgkwsxnsrqorcg\",\"augmentations\":\"mv\",\"beta1\":\"bxeetqujxcxxqn\",\"beta2\":\"qjkedwqurc\",\"distributed\":\"jmrvvxwjongz\",\"earlyStopping\":\"hqqrsilcch\",\"earlyStoppingDelay\":\"xxkan\",\"earlyStoppingPatience\":\"vri\",\"enableOnnxNormalization\":\"gv\",\"evaluationFrequency\":\"jrulfucte\",\"gradientAccumulationStep\":\"thcfj\",\"layersToFreeze\":\"xlyubqjrostv\",\"learningRate\":\"eqmtzzbeqrz\",\"learningRateScheduler\":\"x\",\"modelName\":\"xrd\",\"momentum\":\"bsrwrsnrhpqat\",\"nesterov\":\"kkvyanxk\",\"numberOfEpochs\":\"csemsvuvd\",\"numberOfWorkers\":\"qxetqmmlivrjjx\",\"optimizer\":\"xdchp\",\"randomSeed\":\"xlehzlxpgfquwzp\",\"stepLRGamma\":\"ibelwcerwkw\",\"stepLRStepSize\":\"jxljtxbusq\",\"trainingBatchSize\":\"xxniuisdzhgbd\",\"validationBatchSize\":\"pagsecnad\",\"warmupCosineLRCycles\":\"wqrgxfllmqi\",\"warmupCosineLRWarmupEpochs\":\"ezoell\",\"weightDecay\":\"kiiwvmtu\"}],\"limitSettings\":{\"maxConcurrentTrials\":259319343,\"maxTrials\":1465106108,\"timeout\":\"PT14H16M47S\"},\"sweepSettings\":{\"earlyTermination\":{\"policyType\":\"EarlyTerminationPolicy\",\"delayEvaluation\":1028451528,\"evaluationInterval\":1879980006},\"samplingAlgorithm\":\"Bayesian\"},\"validationData\":{\"jobInputType\":\"mltable\",\"mode\":\"ReadOnlyMount\",\"uri\":\"ilrgun\",\"description\":\"nlduwzorxsbm\"},\"validationDataSize\":10.09388413403216,\"logVerbosity\":\"Warning\",\"targetColumnName\":\"mxkqvf\",\"trainingData\":{\"jobInputType\":\"mltable\",\"mode\":\"Download\",\"uri\":\"dxcltuubwyvpj\",\"description\":\"wcpjqduqgi\"}}")
                .toObject(ImageObjectDetection.class);
        Assertions.assertEquals(LogVerbosity.WARNING, model.logVerbosity());
        Assertions.assertEquals("mxkqvf", model.targetColumnName());
        Assertions.assertEquals("wcpjqduqgi", model.trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.trainingData().mode());
        Assertions.assertEquals("dxcltuubwyvpj", model.trainingData().uri());
        Assertions.assertEquals(ObjectDetectionPrimaryMetrics.MEAN_AVERAGE_PRECISION, model.primaryMetric());
        Assertions.assertEquals("puxgcbdsvalpnpt", model.modelSettings().advancedSettings());
        Assertions.assertEquals(true, model.modelSettings().amsGradient());
        Assertions.assertEquals("xgpazwugxyqv", model.modelSettings().augmentations());
        Assertions.assertEquals(72.82474F, model.modelSettings().beta1());
        Assertions.assertEquals(87.86046F, model.modelSettings().beta2());
        Assertions.assertEquals(953919104, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("z", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals("iuhzzgqlmfa", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals("udjpxpqht", model.modelSettings().checkpointRunId());
        Assertions.assertEquals(true, model.modelSettings().distributed());
        Assertions.assertEquals(false, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1217471622, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(342924982, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(false, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(419853623, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(1049447036, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(336351434, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(79.0951F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.NONE, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("uxsp", model.modelSettings().modelName());
        Assertions.assertEquals(71.59348F, model.modelSettings().momentum());
        Assertions.assertEquals(false, model.modelSettings().nesterov());
        Assertions.assertEquals(1973063413, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1796310561, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.ADAMW, model.modelSettings().optimizer());
        Assertions.assertEquals(1409212705, model.modelSettings().randomSeed());
        Assertions.assertEquals(8.159346F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(99529171, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1768553154, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(385248466, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(70.731415F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(2134877467, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(72.09128F, model.modelSettings().weightDecay());
        Assertions.assertEquals(667354640, model.modelSettings().boxDetectionsPerImage());
        Assertions.assertEquals(57.01898F, model.modelSettings().boxScoreThreshold());
        Assertions.assertEquals(920278919, model.modelSettings().imageSize());
        Assertions.assertEquals(546709544, model.modelSettings().maxSize());
        Assertions.assertEquals(1447146223, model.modelSettings().minSize());
        Assertions.assertEquals(ModelSize.LARGE, model.modelSettings().modelSize());
        Assertions.assertEquals(true, model.modelSettings().multiScale());
        Assertions.assertEquals(58.316856F, model.modelSettings().nmsIouThreshold());
        Assertions.assertEquals("sovyxpavidnievw", model.modelSettings().tileGridSize());
        Assertions.assertEquals(21.210634F, model.modelSettings().tileOverlapRatio());
        Assertions.assertEquals(54.720806F, model.modelSettings().tilePredictionsNmsThreshold());
        Assertions.assertEquals(27.970045F, model.modelSettings().validationIouThreshold());
        Assertions.assertEquals(ValidationMetricType.VOC, model.modelSettings().validationMetricType());
        Assertions.assertEquals("otgkwsxnsrqorcg", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("mv", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("bxeetqujxcxxqn", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("qjkedwqurc", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("jmrvvxwjongz", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("hqqrsilcch", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("xxkan", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("vri", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("gv", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("jrulfucte", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("thcfj", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("xlyubqjrostv", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("eqmtzzbeqrz", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("x", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("xrd", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("bsrwrsnrhpqat", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("kkvyanxk", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("csemsvuvd", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("qxetqmmlivrjjx", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("xdchp", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("xlehzlxpgfquwzp", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("ibelwcerwkw", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("jxljtxbusq", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("xxniuisdzhgbd", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("pagsecnad", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("wqrgxfllmqi", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("ezoell", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("kiiwvmtu", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("axdvwzaehp", model.searchSpace().get(0).boxDetectionsPerImage());
        Assertions.assertEquals("thd", model.searchSpace().get(0).boxScoreThreshold());
        Assertions.assertEquals("mvetatlakfq", model.searchSpace().get(0).imageSize());
        Assertions.assertEquals("xwgiks", model.searchSpace().get(0).maxSize());
        Assertions.assertEquals("vtooxrpo", model.searchSpace().get(0).minSize());
        Assertions.assertEquals("phchgjtnhtukfaci", model.searchSpace().get(0).modelSize());
        Assertions.assertEquals("bfntumeezbxvq", model.searchSpace().get(0).multiScale());
        Assertions.assertEquals("nuvwcgasgomtmjzw", model.searchSpace().get(0).nmsIouThreshold());
        Assertions.assertEquals("qgo", model.searchSpace().get(0).tileGridSize());
        Assertions.assertEquals("xpwwzt", model.searchSpace().get(0).tileOverlapRatio());
        Assertions.assertEquals("mkkhtgfredml", model.searchSpace().get(0).tilePredictionsNmsThreshold());
        Assertions.assertEquals("grllcc", model.searchSpace().get(0).validationIouThreshold());
        Assertions.assertEquals("ovjowazhpabacom", model.searchSpace().get(0).validationMetricType());
        Assertions.assertEquals(259319343, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(1465106108, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT14H16M47S"), model.limitSettings().timeout());
        Assertions.assertEquals(1028451528, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals(1879980006, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals("nlduwzorxsbm", model.validationData().description());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.validationData().mode());
        Assertions.assertEquals("ilrgun", model.validationData().uri());
        Assertions.assertEquals(10.09388413403216D, model.validationDataSize());
    }

    @Test
    public void testSerialize() {
        ImageObjectDetection model =
            new ImageObjectDetection()
                .withLogVerbosity(LogVerbosity.WARNING)
                .withTargetColumnName("mxkqvf")
                .withTrainingData(
                    new MLTableJobInput()
                        .withDescription("wcpjqduqgi")
                        .withMode(InputDeliveryMode.DOWNLOAD)
                        .withUri("dxcltuubwyvpj"))
                .withPrimaryMetric(ObjectDetectionPrimaryMetrics.MEAN_AVERAGE_PRECISION)
                .withModelSettings(
                    new ImageModelSettingsObjectDetection()
                        .withAdvancedSettings("puxgcbdsvalpnpt")
                        .withAmsGradient(true)
                        .withAugmentations("xgpazwugxyqv")
                        .withBeta1(72.82474F)
                        .withBeta2(87.86046F)
                        .withCheckpointFrequency(953919104)
                        .withCheckpointModel(
                            new MLFlowModelJobInput()
                                .withDescription("z")
                                .withMode(InputDeliveryMode.READ_WRITE_MOUNT)
                                .withUri("iuhzzgqlmfa"))
                        .withCheckpointRunId("udjpxpqht")
                        .withDistributed(true)
                        .withEarlyStopping(false)
                        .withEarlyStoppingDelay(1217471622)
                        .withEarlyStoppingPatience(342924982)
                        .withEnableOnnxNormalization(false)
                        .withEvaluationFrequency(419853623)
                        .withGradientAccumulationStep(1049447036)
                        .withLayersToFreeze(336351434)
                        .withLearningRate(79.0951F)
                        .withLearningRateScheduler(LearningRateScheduler.NONE)
                        .withModelName("uxsp")
                        .withMomentum(71.59348F)
                        .withNesterov(false)
                        .withNumberOfEpochs(1973063413)
                        .withNumberOfWorkers(1796310561)
                        .withOptimizer(StochasticOptimizer.ADAMW)
                        .withRandomSeed(1409212705)
                        .withStepLRGamma(8.159346F)
                        .withStepLRStepSize(99529171)
                        .withTrainingBatchSize(1768553154)
                        .withValidationBatchSize(385248466)
                        .withWarmupCosineLRCycles(70.731415F)
                        .withWarmupCosineLRWarmupEpochs(2134877467)
                        .withWeightDecay(72.09128F)
                        .withBoxDetectionsPerImage(667354640)
                        .withBoxScoreThreshold(57.01898F)
                        .withImageSize(920278919)
                        .withMaxSize(546709544)
                        .withMinSize(1447146223)
                        .withModelSize(ModelSize.LARGE)
                        .withMultiScale(true)
                        .withNmsIouThreshold(58.316856F)
                        .withTileGridSize("sovyxpavidnievw")
                        .withTileOverlapRatio(21.210634F)
                        .withTilePredictionsNmsThreshold(54.720806F)
                        .withValidationIouThreshold(27.970045F)
                        .withValidationMetricType(ValidationMetricType.VOC))
                .withSearchSpace(
                    Arrays
                        .asList(
                            new ImageModelDistributionSettingsObjectDetection()
                                .withAmsGradient("otgkwsxnsrqorcg")
                                .withAugmentations("mv")
                                .withBeta1("bxeetqujxcxxqn")
                                .withBeta2("qjkedwqurc")
                                .withDistributed("jmrvvxwjongz")
                                .withEarlyStopping("hqqrsilcch")
                                .withEarlyStoppingDelay("xxkan")
                                .withEarlyStoppingPatience("vri")
                                .withEnableOnnxNormalization("gv")
                                .withEvaluationFrequency("jrulfucte")
                                .withGradientAccumulationStep("thcfj")
                                .withLayersToFreeze("xlyubqjrostv")
                                .withLearningRate("eqmtzzbeqrz")
                                .withLearningRateScheduler("x")
                                .withModelName("xrd")
                                .withMomentum("bsrwrsnrhpqat")
                                .withNesterov("kkvyanxk")
                                .withNumberOfEpochs("csemsvuvd")
                                .withNumberOfWorkers("qxetqmmlivrjjx")
                                .withOptimizer("xdchp")
                                .withRandomSeed("xlehzlxpgfquwzp")
                                .withStepLRGamma("ibelwcerwkw")
                                .withStepLRStepSize("jxljtxbusq")
                                .withTrainingBatchSize("xxniuisdzhgbd")
                                .withValidationBatchSize("pagsecnad")
                                .withWarmupCosineLRCycles("wqrgxfllmqi")
                                .withWarmupCosineLRWarmupEpochs("ezoell")
                                .withWeightDecay("kiiwvmtu")
                                .withBoxDetectionsPerImage("axdvwzaehp")
                                .withBoxScoreThreshold("thd")
                                .withImageSize("mvetatlakfq")
                                .withMaxSize("xwgiks")
                                .withMinSize("vtooxrpo")
                                .withModelSize("phchgjtnhtukfaci")
                                .withMultiScale("bfntumeezbxvq")
                                .withNmsIouThreshold("nuvwcgasgomtmjzw")
                                .withTileGridSize("qgo")
                                .withTileOverlapRatio("xpwwzt")
                                .withTilePredictionsNmsThreshold("mkkhtgfredml")
                                .withValidationIouThreshold("grllcc")
                                .withValidationMetricType("ovjowazhpabacom")))
                .withLimitSettings(
                    new ImageLimitSettings()
                        .withMaxConcurrentTrials(259319343)
                        .withMaxTrials(1465106108)
                        .withTimeout(Duration.parse("PT14H16M47S")))
                .withSweepSettings(
                    new ImageSweepSettings()
                        .withEarlyTermination(
                            new EarlyTerminationPolicy()
                                .withDelayEvaluation(1028451528)
                                .withEvaluationInterval(1879980006))
                        .withSamplingAlgorithm(SamplingAlgorithmType.BAYESIAN))
                .withValidationData(
                    new MLTableJobInput()
                        .withDescription("nlduwzorxsbm")
                        .withMode(InputDeliveryMode.READ_ONLY_MOUNT)
                        .withUri("ilrgun"))
                .withValidationDataSize(10.09388413403216D);
        model = BinaryData.fromObject(model).toObject(ImageObjectDetection.class);
        Assertions.assertEquals(LogVerbosity.WARNING, model.logVerbosity());
        Assertions.assertEquals("mxkqvf", model.targetColumnName());
        Assertions.assertEquals("wcpjqduqgi", model.trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.trainingData().mode());
        Assertions.assertEquals("dxcltuubwyvpj", model.trainingData().uri());
        Assertions.assertEquals(ObjectDetectionPrimaryMetrics.MEAN_AVERAGE_PRECISION, model.primaryMetric());
        Assertions.assertEquals("puxgcbdsvalpnpt", model.modelSettings().advancedSettings());
        Assertions.assertEquals(true, model.modelSettings().amsGradient());
        Assertions.assertEquals("xgpazwugxyqv", model.modelSettings().augmentations());
        Assertions.assertEquals(72.82474F, model.modelSettings().beta1());
        Assertions.assertEquals(87.86046F, model.modelSettings().beta2());
        Assertions.assertEquals(953919104, model.modelSettings().checkpointFrequency());
        Assertions.assertEquals("z", model.modelSettings().checkpointModel().description());
        Assertions.assertEquals(InputDeliveryMode.READ_WRITE_MOUNT, model.modelSettings().checkpointModel().mode());
        Assertions.assertEquals("iuhzzgqlmfa", model.modelSettings().checkpointModel().uri());
        Assertions.assertEquals("udjpxpqht", model.modelSettings().checkpointRunId());
        Assertions.assertEquals(true, model.modelSettings().distributed());
        Assertions.assertEquals(false, model.modelSettings().earlyStopping());
        Assertions.assertEquals(1217471622, model.modelSettings().earlyStoppingDelay());
        Assertions.assertEquals(342924982, model.modelSettings().earlyStoppingPatience());
        Assertions.assertEquals(false, model.modelSettings().enableOnnxNormalization());
        Assertions.assertEquals(419853623, model.modelSettings().evaluationFrequency());
        Assertions.assertEquals(1049447036, model.modelSettings().gradientAccumulationStep());
        Assertions.assertEquals(336351434, model.modelSettings().layersToFreeze());
        Assertions.assertEquals(79.0951F, model.modelSettings().learningRate());
        Assertions.assertEquals(LearningRateScheduler.NONE, model.modelSettings().learningRateScheduler());
        Assertions.assertEquals("uxsp", model.modelSettings().modelName());
        Assertions.assertEquals(71.59348F, model.modelSettings().momentum());
        Assertions.assertEquals(false, model.modelSettings().nesterov());
        Assertions.assertEquals(1973063413, model.modelSettings().numberOfEpochs());
        Assertions.assertEquals(1796310561, model.modelSettings().numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.ADAMW, model.modelSettings().optimizer());
        Assertions.assertEquals(1409212705, model.modelSettings().randomSeed());
        Assertions.assertEquals(8.159346F, model.modelSettings().stepLRGamma());
        Assertions.assertEquals(99529171, model.modelSettings().stepLRStepSize());
        Assertions.assertEquals(1768553154, model.modelSettings().trainingBatchSize());
        Assertions.assertEquals(385248466, model.modelSettings().validationBatchSize());
        Assertions.assertEquals(70.731415F, model.modelSettings().warmupCosineLRCycles());
        Assertions.assertEquals(2134877467, model.modelSettings().warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(72.09128F, model.modelSettings().weightDecay());
        Assertions.assertEquals(667354640, model.modelSettings().boxDetectionsPerImage());
        Assertions.assertEquals(57.01898F, model.modelSettings().boxScoreThreshold());
        Assertions.assertEquals(920278919, model.modelSettings().imageSize());
        Assertions.assertEquals(546709544, model.modelSettings().maxSize());
        Assertions.assertEquals(1447146223, model.modelSettings().minSize());
        Assertions.assertEquals(ModelSize.LARGE, model.modelSettings().modelSize());
        Assertions.assertEquals(true, model.modelSettings().multiScale());
        Assertions.assertEquals(58.316856F, model.modelSettings().nmsIouThreshold());
        Assertions.assertEquals("sovyxpavidnievw", model.modelSettings().tileGridSize());
        Assertions.assertEquals(21.210634F, model.modelSettings().tileOverlapRatio());
        Assertions.assertEquals(54.720806F, model.modelSettings().tilePredictionsNmsThreshold());
        Assertions.assertEquals(27.970045F, model.modelSettings().validationIouThreshold());
        Assertions.assertEquals(ValidationMetricType.VOC, model.modelSettings().validationMetricType());
        Assertions.assertEquals("otgkwsxnsrqorcg", model.searchSpace().get(0).amsGradient());
        Assertions.assertEquals("mv", model.searchSpace().get(0).augmentations());
        Assertions.assertEquals("bxeetqujxcxxqn", model.searchSpace().get(0).beta1());
        Assertions.assertEquals("qjkedwqurc", model.searchSpace().get(0).beta2());
        Assertions.assertEquals("jmrvvxwjongz", model.searchSpace().get(0).distributed());
        Assertions.assertEquals("hqqrsilcch", model.searchSpace().get(0).earlyStopping());
        Assertions.assertEquals("xxkan", model.searchSpace().get(0).earlyStoppingDelay());
        Assertions.assertEquals("vri", model.searchSpace().get(0).earlyStoppingPatience());
        Assertions.assertEquals("gv", model.searchSpace().get(0).enableOnnxNormalization());
        Assertions.assertEquals("jrulfucte", model.searchSpace().get(0).evaluationFrequency());
        Assertions.assertEquals("thcfj", model.searchSpace().get(0).gradientAccumulationStep());
        Assertions.assertEquals("xlyubqjrostv", model.searchSpace().get(0).layersToFreeze());
        Assertions.assertEquals("eqmtzzbeqrz", model.searchSpace().get(0).learningRate());
        Assertions.assertEquals("x", model.searchSpace().get(0).learningRateScheduler());
        Assertions.assertEquals("xrd", model.searchSpace().get(0).modelName());
        Assertions.assertEquals("bsrwrsnrhpqat", model.searchSpace().get(0).momentum());
        Assertions.assertEquals("kkvyanxk", model.searchSpace().get(0).nesterov());
        Assertions.assertEquals("csemsvuvd", model.searchSpace().get(0).numberOfEpochs());
        Assertions.assertEquals("qxetqmmlivrjjx", model.searchSpace().get(0).numberOfWorkers());
        Assertions.assertEquals("xdchp", model.searchSpace().get(0).optimizer());
        Assertions.assertEquals("xlehzlxpgfquwzp", model.searchSpace().get(0).randomSeed());
        Assertions.assertEquals("ibelwcerwkw", model.searchSpace().get(0).stepLRGamma());
        Assertions.assertEquals("jxljtxbusq", model.searchSpace().get(0).stepLRStepSize());
        Assertions.assertEquals("xxniuisdzhgbd", model.searchSpace().get(0).trainingBatchSize());
        Assertions.assertEquals("pagsecnad", model.searchSpace().get(0).validationBatchSize());
        Assertions.assertEquals("wqrgxfllmqi", model.searchSpace().get(0).warmupCosineLRCycles());
        Assertions.assertEquals("ezoell", model.searchSpace().get(0).warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("kiiwvmtu", model.searchSpace().get(0).weightDecay());
        Assertions.assertEquals("axdvwzaehp", model.searchSpace().get(0).boxDetectionsPerImage());
        Assertions.assertEquals("thd", model.searchSpace().get(0).boxScoreThreshold());
        Assertions.assertEquals("mvetatlakfq", model.searchSpace().get(0).imageSize());
        Assertions.assertEquals("xwgiks", model.searchSpace().get(0).maxSize());
        Assertions.assertEquals("vtooxrpo", model.searchSpace().get(0).minSize());
        Assertions.assertEquals("phchgjtnhtukfaci", model.searchSpace().get(0).modelSize());
        Assertions.assertEquals("bfntumeezbxvq", model.searchSpace().get(0).multiScale());
        Assertions.assertEquals("nuvwcgasgomtmjzw", model.searchSpace().get(0).nmsIouThreshold());
        Assertions.assertEquals("qgo", model.searchSpace().get(0).tileGridSize());
        Assertions.assertEquals("xpwwzt", model.searchSpace().get(0).tileOverlapRatio());
        Assertions.assertEquals("mkkhtgfredml", model.searchSpace().get(0).tilePredictionsNmsThreshold());
        Assertions.assertEquals("grllcc", model.searchSpace().get(0).validationIouThreshold());
        Assertions.assertEquals("ovjowazhpabacom", model.searchSpace().get(0).validationMetricType());
        Assertions.assertEquals(259319343, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals(1465106108, model.limitSettings().maxTrials());
        Assertions.assertEquals(Duration.parse("PT14H16M47S"), model.limitSettings().timeout());
        Assertions.assertEquals(1028451528, model.sweepSettings().earlyTermination().delayEvaluation());
        Assertions.assertEquals(1879980006, model.sweepSettings().earlyTermination().evaluationInterval());
        Assertions.assertEquals(SamplingAlgorithmType.BAYESIAN, model.sweepSettings().samplingAlgorithm());
        Assertions.assertEquals("nlduwzorxsbm", model.validationData().description());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.validationData().mode());
        Assertions.assertEquals("ilrgun", model.validationData().uri());
        Assertions.assertEquals(10.09388413403216D, model.validationDataSize());
    }
}
