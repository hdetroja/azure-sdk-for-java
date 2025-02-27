// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubResourceInner;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentity;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentityType;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResourceList;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WebPubSubResourceListTests {
    @Test
    public void testDeserialize() {
        WebPubSubResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"jaoyfhrtx\",\"tier\":\"Free\",\"size\":\"rkujy\",\"family\":\"l\",\"capacity\":867367638},\"properties\":{\"provisioningState\":\"Canceled\",\"externalIP\":\"wrlyxwjkcprb\",\"hostName\":\"b\",\"publicPort\":19976049,\"serverPort\":1017472579,\"version\":\"vpys\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"hostNamePrefix\":\"uj\",\"publicNetworkAccess\":\"uouq\",\"disableLocalAuth\":false,\"disableAadAuth\":false},\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{},\"principalId\":\"itnwuizgazxufi\",\"tenantId\":\"ckyfih\"},\"location\":\"idf\",\"tags\":{\"dkfthwxmnt\":\"dzuhtymwi\",\"aop\":\"i\",\"jcmmxdcufufsrp\":\"km\"},\"id\":\"mzidnsezcxtb\",\"name\":\"sgfyccsnew\",\"type\":\"dwzjeiach\"},{\"sku\":{\"name\":\"osfln\",\"tier\":\"Standard\",\"size\":\"qpteeh\",\"family\":\"vypyqrimzinpv\",\"capacity\":694156912},\"properties\":{\"provisioningState\":\"Canceled\",\"externalIP\":\"soodqxhcrmnoh\",\"hostName\":\"ckwhds\",\"publicPort\":1580515344,\"serverPort\":614073164,\"version\":\"pjxsqwpgrjbznor\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"hostNamePrefix\":\"nb\",\"publicNetworkAccess\":\"nmoc\",\"disableLocalAuth\":false,\"disableAadAuth\":true},\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"bl\",\"tenantId\":\"gpbtoqcjmklj\"},\"location\":\"bqidtqaj\",\"tags\":{\"kudjkrlkhb\":\"l\",\"locx\":\"hfepgzgqex\",\"aierhhb\":\"c\"},\"id\":\"sglumma\",\"name\":\"tjaodxobnb\",\"type\":\"xkqpxo\"},{\"sku\":{\"name\":\"jionpimexgstxgc\",\"tier\":\"Free\",\"size\":\"maajrmvdjwzrlo\",\"family\":\"clwhijcoejctbz\",\"capacity\":21849341},\"properties\":{\"provisioningState\":\"Unknown\",\"externalIP\":\"bkbfkgukdkex\",\"hostName\":\"pofm\",\"publicPort\":159547648,\"serverPort\":1757077121,\"version\":\"pg\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"hostNamePrefix\":\"jjxhvpmo\",\"publicNetworkAccess\":\"zxibqeoj\",\"disableLocalAuth\":true,\"disableAadAuth\":true},\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"wndeicbtwnp\",\"tenantId\":\"oqvuhr\"},\"location\":\"f\",\"tags\":{\"t\":\"ddglm\"},\"id\":\"jqkwpyeicx\",\"name\":\"qciwqvhkhixuigdt\",\"type\":\"pbobjo\"},{\"sku\":{\"name\":\"m\",\"tier\":\"Free\",\"size\":\"m\",\"family\":\"hrzayvvtpgvdf\",\"capacity\":1330318957},\"properties\":{\"provisioningState\":\"Deleting\",\"externalIP\":\"utqxlngx\",\"hostName\":\"fgugnxkrxdqmid\",\"publicPort\":1583346323,\"serverPort\":1570785735,\"version\":\"qdrabhjybigehoqf\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"hostNamePrefix\":\"anyktzlcuiywg\",\"publicNetworkAccess\":\"drvyn\",\"disableLocalAuth\":true,\"disableAadAuth\":true},\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"nc\",\"tenantId\":\"pec\"},\"location\":\"m\",\"tags\":{\"zevgb\":\"ofsx\"},\"id\":\"qjqabcypmivkwl\",\"name\":\"uvcc\",\"type\":\"wnfnbacf\"}],\"nextLink\":\"nlebxetqgtzxd\"}")
                .toObject(WebPubSubResourceList.class);
        Assertions.assertEquals("idf", model.value().get(0).location());
        Assertions.assertEquals("dzuhtymwi", model.value().get(0).tags().get("dkfthwxmnt"));
        Assertions.assertEquals("jaoyfhrtx", model.value().get(0).sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals(867367638, model.value().get(0).sku().capacity());
        Assertions.assertEquals(ManagedIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("uouq", model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals(false, model.value().get(0).disableLocalAuth());
        Assertions.assertEquals(false, model.value().get(0).disableAadAuth());
        Assertions.assertEquals("nlebxetqgtzxd", model.nextLink());
    }

    @Test
    public void testSerialize() {
        WebPubSubResourceList model =
            new WebPubSubResourceList()
                .withValue(
                    Arrays
                        .asList(
                            new WebPubSubResourceInner()
                                .withLocation("idf")
                                .withTags(mapOf("dkfthwxmnt", "dzuhtymwi", "aop", "i", "jcmmxdcufufsrp", "km"))
                                .withSku(
                                    new ResourceSku()
                                        .withName("jaoyfhrtx")
                                        .withTier(WebPubSubSkuTier.FREE)
                                        .withCapacity(867367638))
                                .withIdentity(
                                    new ManagedIdentity()
                                        .withType(ManagedIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPublicNetworkAccess("uouq")
                                .withDisableLocalAuth(false)
                                .withDisableAadAuth(false),
                            new WebPubSubResourceInner()
                                .withLocation("bqidtqaj")
                                .withTags(mapOf("kudjkrlkhb", "l", "locx", "hfepgzgqex", "aierhhb", "c"))
                                .withSku(
                                    new ResourceSku()
                                        .withName("osfln")
                                        .withTier(WebPubSubSkuTier.STANDARD)
                                        .withCapacity(694156912))
                                .withIdentity(
                                    new ManagedIdentity()
                                        .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPublicNetworkAccess("nmoc")
                                .withDisableLocalAuth(false)
                                .withDisableAadAuth(true),
                            new WebPubSubResourceInner()
                                .withLocation("f")
                                .withTags(mapOf("t", "ddglm"))
                                .withSku(
                                    new ResourceSku()
                                        .withName("jionpimexgstxgc")
                                        .withTier(WebPubSubSkuTier.FREE)
                                        .withCapacity(21849341))
                                .withIdentity(
                                    new ManagedIdentity()
                                        .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPublicNetworkAccess("zxibqeoj")
                                .withDisableLocalAuth(true)
                                .withDisableAadAuth(true),
                            new WebPubSubResourceInner()
                                .withLocation("m")
                                .withTags(mapOf("zevgb", "ofsx"))
                                .withSku(
                                    new ResourceSku()
                                        .withName("m")
                                        .withTier(WebPubSubSkuTier.FREE)
                                        .withCapacity(1330318957))
                                .withIdentity(
                                    new ManagedIdentity()
                                        .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withPublicNetworkAccess("drvyn")
                                .withDisableLocalAuth(true)
                                .withDisableAadAuth(true)))
                .withNextLink("nlebxetqgtzxd");
        model = BinaryData.fromObject(model).toObject(WebPubSubResourceList.class);
        Assertions.assertEquals("idf", model.value().get(0).location());
        Assertions.assertEquals("dzuhtymwi", model.value().get(0).tags().get("dkfthwxmnt"));
        Assertions.assertEquals("jaoyfhrtx", model.value().get(0).sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals(867367638, model.value().get(0).sku().capacity());
        Assertions.assertEquals(ManagedIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("uouq", model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals(false, model.value().get(0).disableLocalAuth());
        Assertions.assertEquals(false, model.value().get(0).disableAadAuth());
        Assertions.assertEquals("nlebxetqgtzxd", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
