// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsObjectDetection;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LearningRateScheduler;
import com.azure.resourcemanager.machinelearning.models.MLFlowModelJobInput;
import com.azure.resourcemanager.machinelearning.models.ModelSize;
import com.azure.resourcemanager.machinelearning.models.StochasticOptimizer;
import com.azure.resourcemanager.machinelearning.models.ValidationMetricType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageModelSettingsObjectDetectionTests {
    @Test
    public void testDeserialize() {
        ImageModelSettingsObjectDetection model =
            BinaryData
                .fromString(
                    "{\"boxDetectionsPerImage\":101641984,\"boxScoreThreshold\":16.755789,\"imageSize\":1076058960,\"maxSize\":191759687,\"minSize\":1378586528,\"modelSize\":\"ExtraLarge\",\"multiScale\":true,\"nmsIouThreshold\":18.348568,\"tileGridSize\":\"ljzgdy\",\"tileOverlapRatio\":96.23886,\"tilePredictionsNmsThreshold\":36.949356,\"validationIouThreshold\":45.30077,\"validationMetricType\":\"CocoVoc\",\"advancedSettings\":\"rqhbjnqogdxwbsfp\",\"amsGradient\":false,\"augmentations\":\"jlf\",\"beta1\":75.122604,\"beta2\":77.73417,\"checkpointFrequency\":1341111685,\"checkpointModel\":{\"jobInputType\":\"mlflow_model\",\"mode\":\"Download\",\"uri\":\"jluxxdhi\",\"description\":\"zd\"},\"checkpointRunId\":\"qjm\",\"distributed\":false,\"earlyStopping\":false,\"earlyStoppingDelay\":954713869,\"earlyStoppingPatience\":1623513694,\"enableOnnxNormalization\":false,\"evaluationFrequency\":1227246383,\"gradientAccumulationStep\":445418051,\"layersToFreeze\":1633383721,\"learningRate\":20.159918,\"learningRateScheduler\":\"WarmupCosine\",\"modelName\":\"znkcqwwxwjy\",\"momentum\":68.34347,\"nesterov\":true,\"numberOfEpochs\":370561675,\"numberOfWorkers\":561740795,\"optimizer\":\"None\",\"randomSeed\":1563473495,\"stepLRGamma\":32.891335,\"stepLRStepSize\":795985008,\"trainingBatchSize\":485145114,\"validationBatchSize\":638318099,\"warmupCosineLRCycles\":34.38207,\"warmupCosineLRWarmupEpochs\":771716822,\"weightDecay\":76.72818}")
                .toObject(ImageModelSettingsObjectDetection.class);
        Assertions.assertEquals("rqhbjnqogdxwbsfp", model.advancedSettings());
        Assertions.assertEquals(false, model.amsGradient());
        Assertions.assertEquals("jlf", model.augmentations());
        Assertions.assertEquals(75.122604F, model.beta1());
        Assertions.assertEquals(77.73417F, model.beta2());
        Assertions.assertEquals(1341111685, model.checkpointFrequency());
        Assertions.assertEquals("zd", model.checkpointModel().description());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.checkpointModel().mode());
        Assertions.assertEquals("jluxxdhi", model.checkpointModel().uri());
        Assertions.assertEquals("qjm", model.checkpointRunId());
        Assertions.assertEquals(false, model.distributed());
        Assertions.assertEquals(false, model.earlyStopping());
        Assertions.assertEquals(954713869, model.earlyStoppingDelay());
        Assertions.assertEquals(1623513694, model.earlyStoppingPatience());
        Assertions.assertEquals(false, model.enableOnnxNormalization());
        Assertions.assertEquals(1227246383, model.evaluationFrequency());
        Assertions.assertEquals(445418051, model.gradientAccumulationStep());
        Assertions.assertEquals(1633383721, model.layersToFreeze());
        Assertions.assertEquals(20.159918F, model.learningRate());
        Assertions.assertEquals(LearningRateScheduler.WARMUP_COSINE, model.learningRateScheduler());
        Assertions.assertEquals("znkcqwwxwjy", model.modelName());
        Assertions.assertEquals(68.34347F, model.momentum());
        Assertions.assertEquals(true, model.nesterov());
        Assertions.assertEquals(370561675, model.numberOfEpochs());
        Assertions.assertEquals(561740795, model.numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.optimizer());
        Assertions.assertEquals(1563473495, model.randomSeed());
        Assertions.assertEquals(32.891335F, model.stepLRGamma());
        Assertions.assertEquals(795985008, model.stepLRStepSize());
        Assertions.assertEquals(485145114, model.trainingBatchSize());
        Assertions.assertEquals(638318099, model.validationBatchSize());
        Assertions.assertEquals(34.38207F, model.warmupCosineLRCycles());
        Assertions.assertEquals(771716822, model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(76.72818F, model.weightDecay());
        Assertions.assertEquals(101641984, model.boxDetectionsPerImage());
        Assertions.assertEquals(16.755789F, model.boxScoreThreshold());
        Assertions.assertEquals(1076058960, model.imageSize());
        Assertions.assertEquals(191759687, model.maxSize());
        Assertions.assertEquals(1378586528, model.minSize());
        Assertions.assertEquals(ModelSize.EXTRA_LARGE, model.modelSize());
        Assertions.assertEquals(true, model.multiScale());
        Assertions.assertEquals(18.348568F, model.nmsIouThreshold());
        Assertions.assertEquals("ljzgdy", model.tileGridSize());
        Assertions.assertEquals(96.23886F, model.tileOverlapRatio());
        Assertions.assertEquals(36.949356F, model.tilePredictionsNmsThreshold());
        Assertions.assertEquals(45.30077F, model.validationIouThreshold());
        Assertions.assertEquals(ValidationMetricType.COCO_VOC, model.validationMetricType());
    }

    @Test
    public void testSerialize() {
        ImageModelSettingsObjectDetection model =
            new ImageModelSettingsObjectDetection()
                .withAdvancedSettings("rqhbjnqogdxwbsfp")
                .withAmsGradient(false)
                .withAugmentations("jlf")
                .withBeta1(75.122604F)
                .withBeta2(77.73417F)
                .withCheckpointFrequency(1341111685)
                .withCheckpointModel(
                    new MLFlowModelJobInput()
                        .withDescription("zd")
                        .withMode(InputDeliveryMode.DOWNLOAD)
                        .withUri("jluxxdhi"))
                .withCheckpointRunId("qjm")
                .withDistributed(false)
                .withEarlyStopping(false)
                .withEarlyStoppingDelay(954713869)
                .withEarlyStoppingPatience(1623513694)
                .withEnableOnnxNormalization(false)
                .withEvaluationFrequency(1227246383)
                .withGradientAccumulationStep(445418051)
                .withLayersToFreeze(1633383721)
                .withLearningRate(20.159918F)
                .withLearningRateScheduler(LearningRateScheduler.WARMUP_COSINE)
                .withModelName("znkcqwwxwjy")
                .withMomentum(68.34347F)
                .withNesterov(true)
                .withNumberOfEpochs(370561675)
                .withNumberOfWorkers(561740795)
                .withOptimizer(StochasticOptimizer.NONE)
                .withRandomSeed(1563473495)
                .withStepLRGamma(32.891335F)
                .withStepLRStepSize(795985008)
                .withTrainingBatchSize(485145114)
                .withValidationBatchSize(638318099)
                .withWarmupCosineLRCycles(34.38207F)
                .withWarmupCosineLRWarmupEpochs(771716822)
                .withWeightDecay(76.72818F)
                .withBoxDetectionsPerImage(101641984)
                .withBoxScoreThreshold(16.755789F)
                .withImageSize(1076058960)
                .withMaxSize(191759687)
                .withMinSize(1378586528)
                .withModelSize(ModelSize.EXTRA_LARGE)
                .withMultiScale(true)
                .withNmsIouThreshold(18.348568F)
                .withTileGridSize("ljzgdy")
                .withTileOverlapRatio(96.23886F)
                .withTilePredictionsNmsThreshold(36.949356F)
                .withValidationIouThreshold(45.30077F)
                .withValidationMetricType(ValidationMetricType.COCO_VOC);
        model = BinaryData.fromObject(model).toObject(ImageModelSettingsObjectDetection.class);
        Assertions.assertEquals("rqhbjnqogdxwbsfp", model.advancedSettings());
        Assertions.assertEquals(false, model.amsGradient());
        Assertions.assertEquals("jlf", model.augmentations());
        Assertions.assertEquals(75.122604F, model.beta1());
        Assertions.assertEquals(77.73417F, model.beta2());
        Assertions.assertEquals(1341111685, model.checkpointFrequency());
        Assertions.assertEquals("zd", model.checkpointModel().description());
        Assertions.assertEquals(InputDeliveryMode.DOWNLOAD, model.checkpointModel().mode());
        Assertions.assertEquals("jluxxdhi", model.checkpointModel().uri());
        Assertions.assertEquals("qjm", model.checkpointRunId());
        Assertions.assertEquals(false, model.distributed());
        Assertions.assertEquals(false, model.earlyStopping());
        Assertions.assertEquals(954713869, model.earlyStoppingDelay());
        Assertions.assertEquals(1623513694, model.earlyStoppingPatience());
        Assertions.assertEquals(false, model.enableOnnxNormalization());
        Assertions.assertEquals(1227246383, model.evaluationFrequency());
        Assertions.assertEquals(445418051, model.gradientAccumulationStep());
        Assertions.assertEquals(1633383721, model.layersToFreeze());
        Assertions.assertEquals(20.159918F, model.learningRate());
        Assertions.assertEquals(LearningRateScheduler.WARMUP_COSINE, model.learningRateScheduler());
        Assertions.assertEquals("znkcqwwxwjy", model.modelName());
        Assertions.assertEquals(68.34347F, model.momentum());
        Assertions.assertEquals(true, model.nesterov());
        Assertions.assertEquals(370561675, model.numberOfEpochs());
        Assertions.assertEquals(561740795, model.numberOfWorkers());
        Assertions.assertEquals(StochasticOptimizer.NONE, model.optimizer());
        Assertions.assertEquals(1563473495, model.randomSeed());
        Assertions.assertEquals(32.891335F, model.stepLRGamma());
        Assertions.assertEquals(795985008, model.stepLRStepSize());
        Assertions.assertEquals(485145114, model.trainingBatchSize());
        Assertions.assertEquals(638318099, model.validationBatchSize());
        Assertions.assertEquals(34.38207F, model.warmupCosineLRCycles());
        Assertions.assertEquals(771716822, model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals(76.72818F, model.weightDecay());
        Assertions.assertEquals(101641984, model.boxDetectionsPerImage());
        Assertions.assertEquals(16.755789F, model.boxScoreThreshold());
        Assertions.assertEquals(1076058960, model.imageSize());
        Assertions.assertEquals(191759687, model.maxSize());
        Assertions.assertEquals(1378586528, model.minSize());
        Assertions.assertEquals(ModelSize.EXTRA_LARGE, model.modelSize());
        Assertions.assertEquals(true, model.multiScale());
        Assertions.assertEquals(18.348568F, model.nmsIouThreshold());
        Assertions.assertEquals("ljzgdy", model.tileGridSize());
        Assertions.assertEquals(96.23886F, model.tileOverlapRatio());
        Assertions.assertEquals(36.949356F, model.tilePredictionsNmsThreshold());
        Assertions.assertEquals(45.30077F, model.validationIouThreshold());
        Assertions.assertEquals(ValidationMetricType.COCO_VOC, model.validationMetricType());
    }
}
