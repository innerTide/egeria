/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

// This is a generated file - do not edit - changes should be made to the templates amd/or generator to generate this file with changes.

package org.odpi.openmetadata.fvt.opentypes.relationships.SoftwareServerPlatformDeployment;
import org.odpi.openmetadata.fvt.opentypes.common.*;
import org.odpi.openmetadata.fvt.opentypes.enums.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.*;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.typedefs.*;
import org.odpi.openmetadata.fvt.opentypes.relationships.SoftwareServerPlatformDeployment.SoftwareServerPlatformDeployment;

import java.util.*;

/**
 * Static mapping methods to map between SoftwareServerPlatformDeployment and the omrs Relationship.
 */
public class SoftwareServerPlatformDeploymentMapper {
       private static final Logger log = LoggerFactory.getLogger(SoftwareServerPlatformDeploymentMapper.class);
       private static final String className = SoftwareServerPlatformDeploymentMapper.class.getName();

       public static SoftwareServerPlatformDeployment mapOmrsRelationshipToSoftwareServerPlatformDeployment(Relationship omrsRelationship) {
                String methodName = "mapOmrsRelationshipToSoftwareServerPlatformDeployment";
               SoftwareServerPlatformDeployment softwareServerPlatformDeployment = new SoftwareServerPlatformDeployment(omrsRelationship);
               SystemAttributes systemAttributes = new SystemAttributes();
               systemAttributes.setStatus(omrsRelationship.getStatus());
               systemAttributes.setCreatedBy(omrsRelationship.getCreatedBy());
               systemAttributes.setUpdatedBy(omrsRelationship.getUpdatedBy());
               systemAttributes.setCreateTime(omrsRelationship.getCreateTime());
               systemAttributes.setUpdateTime(omrsRelationship.getUpdateTime());
               systemAttributes.setVersion(omrsRelationship.getVersion());
               systemAttributes.setGUID(omrsRelationship.getGUID());
               softwareServerPlatformDeployment.setGuid(omrsRelationship.getGUID());
               softwareServerPlatformDeployment.setSystemAttributes(systemAttributes);

               InstanceProperties omrsRelationshipProperties = omrsRelationship.getProperties();
               if (omrsRelationshipProperties !=null) {
                 omrsRelationshipProperties.setEffectiveFromTime(softwareServerPlatformDeployment.getEffectiveFromTime());
                 omrsRelationshipProperties.setEffectiveToTime(softwareServerPlatformDeployment.getEffectiveToTime());
                 Iterator omrsPropertyIterator = omrsRelationshipProperties.getPropertyNames();
                 while (omrsPropertyIterator.hasNext()) {
                    String name = (String) omrsPropertyIterator.next();
                    //TODO check if this is a property we expect or whether the type has been added to.
                    // this is a property we expect
                    InstancePropertyValue value = omrsRelationshipProperties.getPropertyValue(name);
                    // supplied guid matches the expected type
                    Object actualValue;
                    switch (value.getInstancePropertyCategory()) {
                                               case PRIMITIVE:
                                                   PrimitivePropertyValue primitivePropertyValue = (PrimitivePropertyValue) value;
                                                   actualValue = primitivePropertyValue.getPrimitiveValue();
                                                   if (SoftwareServerPlatformDeployment.ATTRIBUTE_NAMES_SET.contains(name)) {
                                                      if (name.equals("deploymentTime")) {
                                                           softwareServerPlatformDeployment.setDeploymentTime((java.util.Date)actualValue);
                                                      }
                                                      if (name.equals("deployer")) {
                                                           softwareServerPlatformDeployment.setDeployer((String)actualValue);
                                                      }
                                                   } else {
                                                       // put out the omrs value object
                                                       if (softwareServerPlatformDeployment.getExtraAttributes() ==null) {
                                                            Map<String, Object> extraAttributes = new HashMap();
                                                            softwareServerPlatformDeployment.setExtraAttributes(extraAttributes);
                                                        }
                                                      softwareServerPlatformDeployment.getExtraAttributes().put(name, primitivePropertyValue);
                                                   }
                                                   break;
                                               case ENUM:
                                                   EnumPropertyValue enumPropertyValue = (EnumPropertyValue) value;
                                                   String symbolicName = enumPropertyValue.getSymbolicName();
                                                   if (SoftwareServerPlatformDeployment.ENUM_NAMES_SET.contains(name)) {
                                                        if (name.equals("platformStatus")) {
                                                              OperationalStatus platformStatus = OperationalStatus.valueOf(symbolicName);
                                                             softwareServerPlatformDeployment.setPlatformStatus(platformStatus);
                                                        }
                                                   } else {
                                                       // put out the omrs value object
                                                        if (softwareServerPlatformDeployment.getExtraAttributes() ==null) {
                                                            Map<String, Object> extraAttributes = new HashMap();
                                                            softwareServerPlatformDeployment.setExtraAttributes(extraAttributes);
                                                        }

                                                        softwareServerPlatformDeployment.getExtraAttributes().put(name, enumPropertyValue);
                                                    }
                       
                                                   break;
                                               case MAP:
                                                    if (softwareServerPlatformDeployment.MAP_NAMES_SET.contains(name)) {
                                                        MapPropertyValue mapPropertyValue = (MapPropertyValue) value;
                                                        InstanceProperties instancePropertyForMap = (InstanceProperties) mapPropertyValue.getMapValues();

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
               return softwareServerPlatformDeployment;
       }
       public static Relationship mapSoftwareServerPlatformDeploymentToOmrsRelationship(SoftwareServerPlatformDeployment softwareServerPlatformDeployment) {
           Relationship omrsRelationship = Line.createOmrsRelationship(softwareServerPlatformDeployment);

           SystemAttributes systemAttributes = softwareServerPlatformDeployment.getSystemAttributes();
           if (systemAttributes!=null) {
               if (systemAttributes.getCreatedBy()!=null)
                   omrsRelationship.setCreatedBy(systemAttributes.getCreatedBy());
               if (systemAttributes.getUpdatedBy()!=null)
                   omrsRelationship.setUpdatedBy(systemAttributes.getUpdatedBy());
               if (systemAttributes.getCreateTime()!=null)
                   omrsRelationship.setCreateTime(systemAttributes.getCreateTime());
               if (systemAttributes.getUpdateTime()!=null)
                   omrsRelationship.setUpdateTime(systemAttributes.getUpdateTime());
               if (systemAttributes.getVersion()!=null)
                   omrsRelationship.setVersion(systemAttributes.getVersion());
                if (systemAttributes.getGUID()!=null)
                   omrsRelationship.setGUID(systemAttributes.getGUID());
               if (systemAttributes.getStatus()!=null)
                   omrsRelationship.setStatus(systemAttributes.getStatus());
           }
           //set proxy 1
           EntityProxy entityOne = new EntityProxy();
           entityOne.setGUID(softwareServerPlatformDeployment.getEntity1Guid());
           String type1 = softwareServerPlatformDeployment.getEntity1Type();
           InstanceType instancetype1 = new InstanceType();
           instancetype1.setTypeDefName(type1);
           entityOne.setType(instancetype1);
           //set proxy 2
           EntityProxy entityTwo = new EntityProxy();
           entityTwo.setGUID(softwareServerPlatformDeployment.getEntity2Guid());
           String type2 = softwareServerPlatformDeployment.getEntity2Type();
           InstanceType instancetype2 = new InstanceType();
           instancetype2.setTypeDefName(type2);
           entityTwo.setType(instancetype2);
           // set relationshipType
           InstanceType relationshipType = new InstanceType();
           relationshipType.setTypeDefGUID(softwareServerPlatformDeployment.getTypeDefGuid());
           relationshipType.setTypeDefName("SoftwareServerPlatformDeployment");
           omrsRelationship.setType(relationshipType);           
   
           omrsRelationship.setEntityOneProxy(entityOne);
           omrsRelationship.setEntityTwoProxy(entityTwo);           
           if (omrsRelationship.getGUID() == null) {
               omrsRelationship.setGUID(softwareServerPlatformDeployment.getGuid());
           }

           InstanceProperties instanceProperties = new InstanceProperties();
           // primitives

            if (softwareServerPlatformDeployment.getDeploymentTime()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_DATE);
                primitivePropertyValue.setPrimitiveValue(softwareServerPlatformDeployment.getDeploymentTime());
                instanceProperties.setProperty("deploymentTime", primitivePropertyValue);
            }
            if (softwareServerPlatformDeployment.getDeployer()!=null) {
                PrimitivePropertyValue primitivePropertyValue = new PrimitivePropertyValue();
                primitivePropertyValue.setPrimitiveDefCategory(PrimitiveDefCategory.OM_PRIMITIVE_TYPE_STRING);
                primitivePropertyValue.setPrimitiveValue(softwareServerPlatformDeployment.getDeployer());
                instanceProperties.setProperty("deployer", primitivePropertyValue);
            }
            if (softwareServerPlatformDeployment.getPlatformStatus()!=null) {
                OperationalStatus enumType = softwareServerPlatformDeployment.getPlatformStatus();
                EnumPropertyValue enumPropertyValue = new EnumPropertyValue();
                enumPropertyValue.setOrdinal(enumType.ordinal());
                enumPropertyValue.setSymbolicName(enumType.name());
                instanceProperties.setProperty("platformStatus", enumPropertyValue);
            }
            omrsRelationship.setProperties(instanceProperties);

           return omrsRelationship;
       }
}