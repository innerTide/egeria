/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

// This is a generated file - do not edit - changes should be made to the templates amd/or generator to generate this file with changes.

package org.odpi.openmetadata.fvt.opentypes.entities.NamingStandardRule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

// omrs
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.*;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.typedefs.*;
import org.odpi.openmetadata.repositoryservices.archivemanager.OMRSArchiveAccessor;
import org.odpi.openmetadata.fvt.opentypes.common.*;
import org.odpi.openmetadata.fvt.opentypes.classifications.ClassificationBeanFactory;
import org.odpi.openmetadata.fvt.opentypes.enums.*;
import org.odpi.openmetadata.repositoryservices.ffdc.exception.InvalidParameterException;
/**
 * Static mapping methods to map between NamingStandardRule and the omrs equivalents.
 */
public class NamingStandardRuleMapper {
    private static final Logger log = LoggerFactory.getLogger( NamingStandardRuleMapper.class);
    private static final String className = NamingStandardRuleMapper.class.getName();
   /**
    * @param omrsEntityDetail the supplied EntityDetail
    * @return equivalent NamingStandardRule
    */
   static public NamingStandardRule mapOmrsEntityDetailToNamingStandardRule(EntityDetail omrsEntityDetail) throws InvalidParameterException {
        String entityTypeName = omrsEntityDetail.getType().getTypeDefName();
        if ("NamingStandardRule".equals(entityTypeName)) {
                NamingStandardRule namingStandardRule = new NamingStandardRule();
                //set core attributes
                SystemAttributes systemAttributes = new SystemAttributes();
                systemAttributes.setStatus(omrsEntityDetail.getStatus());

                systemAttributes.setCreatedBy(omrsEntityDetail.getCreatedBy());
                systemAttributes.setUpdatedBy(omrsEntityDetail.getUpdatedBy());
                systemAttributes.setCreateTime(omrsEntityDetail.getCreateTime());
                systemAttributes.setUpdateTime(omrsEntityDetail.getUpdateTime());
                systemAttributes.setVersion(omrsEntityDetail.getVersion());
                systemAttributes.setGUID(omrsEntityDetail.getGUID());
                namingStandardRule.setSystemAttributes(systemAttributes);

                // Set properties
                InstanceProperties omrsEntityDetailProperties = omrsEntityDetail.getProperties();
                if (omrsEntityDetailProperties!=null) {
                  omrsEntityDetailProperties.setEffectiveFromTime(namingStandardRule.getEffectiveFromTime());
                  omrsEntityDetailProperties.setEffectiveToTime(namingStandardRule.getEffectiveToTime());
                  Iterator omrsPropertyIterator = omrsEntityDetailProperties.getPropertyNames();

                  while (omrsPropertyIterator.hasNext()) {
                    String name = (String) omrsPropertyIterator.next();
                    //TODO check if this is a property we expect or whether the type has been added to.
                    // this is a property we expect
                    InstancePropertyValue value = omrsEntityDetailProperties.getPropertyValue(name);

                    // supplied guid matches the expected type

                    Object actualValue;
                    switch (value.getInstancePropertyCategory()) {
                        case PRIMITIVE:
                            PrimitivePropertyValue primitivePropertyValue = (PrimitivePropertyValue) value;
                            actualValue = primitivePropertyValue.getPrimitiveValue();
                            if (namingStandardRule.ATTRIBUTE_NAMES_SET.contains(name)) {
                               if (name.equals("namePattern")) {
                                   namingStandardRule.setNamePattern((String)actualValue);
                               }
                               if (name.equals("implementationDescription")) {
                                   namingStandardRule.setImplementationDescription((String)actualValue);
                               }
                               if (name.equals("title")) {
                                   namingStandardRule.setTitle((String)actualValue);
                               }
                               if (name.equals("summary")) {
                                   namingStandardRule.setSummary((String)actualValue);
                               }
                               if (name.equals("description")) {
                                   namingStandardRule.setDescription((String)actualValue);
                               }
                               if (name.equals("scope")) {
                                   namingStandardRule.setScope((String)actualValue);
                               }
                               if (name.equals("priority")) {
                                   namingStandardRule.setPriority((String)actualValue);
                               }
                               if (name.equals("qualifiedName")) {
                                   namingStandardRule.setQualifiedName((String)actualValue);
                               }
                            } else {
                                // put out the omrs value object
                                if (null==namingStandardRule.getExtraAttributes())  {
                                     namingStandardRule.setExtraAttributes(new HashMap<String, Object>());
                                }
                               namingStandardRule.getExtraAttributes().put(name, primitivePropertyValue);
                            }
                            break;
                        case ENUM:
                            EnumPropertyValue enumPropertyValue = (EnumPropertyValue) value;
                            String symbolicName = enumPropertyValue.getSymbolicName();
                            if (namingStandardRule.ENUM_NAMES_SET.contains(name)) {
                                 if (name.equals("domain")) {
                                      GovernanceDomain domain = GovernanceDomain.valueOf(symbolicName);
                                      namingStandardRule.setDomain(domain);
                                 }
                            } else {
                                // put out the omrs value object
                                if (null==namingStandardRule.getExtraAttributes())  {
                                     namingStandardRule.setExtraAttributes(new HashMap<String, Object>());
                                }
                                 namingStandardRule.getExtraAttributes().put(name, enumPropertyValue);
                             }

                            break;
                        case MAP:
                            if (namingStandardRule.MAP_NAMES_SET.contains(name)) {
                                 MapPropertyValue mapPropertyValue = (MapPropertyValue) value;
                                 InstanceProperties instancePropertyForMap = (InstanceProperties) mapPropertyValue.getMapValues();

                                 if (name.equals("additionalProperties")) {

                                       // Only support Map<String,String> as that is what is in the archive types at this time.
                                       Map<String, String> actualMap = new HashMap();
                                       Iterator iter = instancePropertyForMap.getPropertyNames();
                                       while (iter.hasNext()) {
                                           String mapkey = (String) iter.next();
                                           PrimitivePropertyValue primitivePropertyMapValue = (PrimitivePropertyValue) instancePropertyForMap.getPropertyValue(mapkey);
                                           String mapvalue = (String) primitivePropertyMapValue.getPrimitiveValue();
                                           actualMap.put(mapkey, mapvalue);
                                       }
                                       namingStandardRule.setAdditionalProperties(actualMap);
                                 }
                               }
                               break;
                        case ARRAY:
                        case STRUCT:
                        case UNKNOWN:
                            // error
                            break;
                    }

                  }   // end while
                }
                 // set classifications
                 List<org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> omrsclassifications = omrsEntityDetail.getClassifications() ;
                 if (omrsclassifications != null && !omrsclassifications.isEmpty()){
                    for (org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification omrsClassification:omrsclassifications) {
                        String omrsClassificationName = omrsClassification.getName();
                        ClassificationBean classificationBean = ClassificationBeanFactory.getClassificationBean(omrsClassificationName,omrsClassification);
                        if (classificationBean !=null) {
                            // this is a classification we know about.
                            if ( namingStandardRule.classifications==null) {
                                 namingStandardRule.classifications = new ArrayList<>();
                            }
                            namingStandardRule.classifications.add(classificationBean);

                        } else {
                            if (null==namingStandardRule.getExtraClassificationBeans())  {
                                 namingStandardRule.setExtraClassificationBeans(new HashMap<String, org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification>());
                            }
                            namingStandardRule.getExtraClassificationBeans().put(omrsClassificationName,omrsClassification);
                        }
                    }
                 }
                 return namingStandardRule;
            } else {
                // TODO wrong entity type for this guid
            }
            return null;
    }
    /**
     * Map (convert) the supplied NamingStandardRule to an entityDetails.
     * @param  namingStandardRule  supplied NamingStandardRule
     * @return  entityDetails equivalent to namingStandardRule
     */
    static public EntityDetail mapNamingStandardRuleToOmrsEntityDetail(NamingStandardRule namingStandardRule) {
            EntityDetail omrsEntityDetail = new EntityDetail();
            SystemAttributes systemAttributes = namingStandardRule.getSystemAttributes();
            if (systemAttributes!=null) {
                   if (systemAttributes.getCreatedBy()!=null)
                        omrsEntityDetail.setCreatedBy(systemAttributes.getCreatedBy());
                   if (systemAttributes.getUpdatedBy()!=null)
                        omrsEntityDetail.setUpdatedBy(systemAttributes.getUpdatedBy());
                   if (systemAttributes.getCreateTime()!=null)
                        omrsEntityDetail.setCreateTime(systemAttributes.getCreateTime());
                   if (systemAttributes.getUpdateTime()!=null)
                        omrsEntityDetail.setUpdateTime(systemAttributes.getUpdateTime());
                   if (systemAttributes.getVersion()!=null)
                        omrsEntityDetail.setVersion(systemAttributes.getVersion());
                   if (systemAttributes.getGUID()!=null)
                        omrsEntityDetail.setGUID(systemAttributes.getGUID());
                   if (systemAttributes.getStatus()!=null) {
                        omrsEntityDetail.setStatus(systemAttributes.getStatus());
                   }
            }

            InstanceProperties instanceProperties = new InstanceProperties();
            instanceProperties.setEffectiveFromTime(namingStandardRule.getEffectiveFromTime());
            instanceProperties.setEffectiveToTime(namingStandardRule.getEffectiveToTime());
            // primitives

            if (namingStandardRule.getNamePattern()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getNamePattern());
                instanceProperties.setProperty("namePattern", primitivePropertyValue);
            }
            if (namingStandardRule.getImplementationDescription()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getImplementationDescription());
                instanceProperties.setProperty("implementationDescription", primitivePropertyValue);
            }
            if (namingStandardRule.getTitle()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getTitle());
                instanceProperties.setProperty("title", primitivePropertyValue);
            }
            if (namingStandardRule.getSummary()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getSummary());
                instanceProperties.setProperty("summary", primitivePropertyValue);
            }
            if (namingStandardRule.getDescription()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getDescription());
                instanceProperties.setProperty("description", primitivePropertyValue);
            }
            if (namingStandardRule.getScope()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getScope());
                instanceProperties.setProperty("scope", primitivePropertyValue);
            }
            if (namingStandardRule.getPriority()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getPriority());
                instanceProperties.setProperty("priority", primitivePropertyValue);
            }
            if (namingStandardRule.getQualifiedName()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(namingStandardRule.getQualifiedName());
                instanceProperties.setProperty("qualifiedName", primitivePropertyValue);
            }
            if (namingStandardRule.getDomain()!=null) {
                GovernanceDomain enumType = namingStandardRule.getDomain();
                EnumPropertyValue enumPropertyValue = new EnumPropertyValue();
                enumPropertyValue.setOrdinal(enumType.ordinal());
                enumPropertyValue.setSymbolicName(enumType.name());
                instanceProperties.setProperty("domain", enumPropertyValue);
            }
            if (namingStandardRule.getAdditionalProperties()!=null) {

                Map<String,String> map =namingStandardRule.getAdditionalProperties();
                MapPropertyValue mapPropertyValue = new MapPropertyValue();

                for (String key:map.keySet()) {
                   PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                   primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                   primitivePropertyValue.setPrimitiveValue(map.get(key));
                   mapPropertyValue.setMapValue(key,primitivePropertyValue);
                }

                instanceProperties.setProperty("additionalProperties", mapPropertyValue);
            }
            omrsEntityDetail.setProperties(instanceProperties);
            // set the type in the entity
            OMRSArchiveAccessor archiveAccessor = OMRSArchiveAccessor.getInstance();
            TypeDef typeDef = archiveAccessor.getEntityDefByName("NamingStandardRule");
            InstanceType template = archiveAccessor.createTemplateFromTypeDef(typeDef);
            InstanceType instanceType = new InstanceType(template);
            omrsEntityDetail.setType(instanceType);

            // map the classifications
            populateOmrsEntityWithClassificationBeans(omrsEntityDetail,(List<ClassificationBean>)namingStandardRule.getClassificationBeans());
            return omrsEntityDetail;
    }

    private static void populateOmrsEntityWithClassificationBeans(EntityDetail omrsEntityDetail, List<ClassificationBean> classificationBeans) {
        if (classificationBeans!= null && classificationBeans.size()>0) {
            ArrayList<org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification> omrsClassifications = new ArrayList<org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification>();
            for (ClassificationBean classificationBean : classificationBeans) {
                SystemAttributes systemAttributes = classificationBean.getSystemAttributes();
                org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification omrsClassification = new org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.Classification();

                if (systemAttributes != null) {
                    if (systemAttributes.getCreatedBy() != null)
                        omrsClassification.setCreatedBy(systemAttributes.getCreatedBy());
                    if (systemAttributes.getUpdatedBy() != null)
                        omrsClassification.setUpdatedBy(systemAttributes.getUpdatedBy());
                    if (systemAttributes.getCreateTime() != null)
                        omrsClassification.setCreateTime(systemAttributes.getCreateTime());
                    if (systemAttributes.getUpdateTime() != null)
                        omrsClassification.setUpdateTime(systemAttributes.getUpdateTime());
                    if (systemAttributes.getVersion() != null)
                        omrsClassification.setVersion(systemAttributes.getVersion());
                }
                // copy over the classification name
                omrsClassification.setName(classificationBean.getClassificationName());
                // copy over the classification properties
                omrsClassification.setProperties( classificationBean.obtainInstanceProperties());
                omrsClassifications.add(omrsClassification);
            }
            omrsEntityDetail.setClassifications(omrsClassifications);
        }
    }
}