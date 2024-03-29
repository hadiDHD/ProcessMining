/**
 * Copyright (c) 2003-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package at.jku.se.eclipse.emf.ecore.change;


import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.se.eclipse.emf.ecore.change.ChangePackage
 * @generated
 */
public interface ChangeFactory extends EFactory{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ChangeFactory eINSTANCE = at.jku.se.eclipse.emf.ecore.change.impl.ChangeFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
  ChangeDescription createChangeDescription();

  /**
	 * Returns a new object of class '<em>Feature Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Change</em>'.
	 * @generated
	 */
  FeatureChange createFeatureChange();

  FeatureChange createFeatureChange(EStructuralFeature feature, Object oldValue, Notification notification, long timeStamp);

  /**
	 * Returns a new object of class '<em>List Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Change</em>'.
	 * @generated
	 */
  ListChange createListChange();

  /**
	 * Returns a new object of class '<em>Resource Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Change</em>'.
	 * @generated
	 */
  ResourceChange createResourceChange();

  ResourceChange createResourceChange(Resource resource, EList<Object> oldValue, long timeStamp);

  /**
	 * Returns a new object of class '<em>Feature Map Entry</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Map Entry</em>'.
	 * @generated
	 */
  FeatureMapEntry createFeatureMapEntry();

  /**
	 * Returns a new object of class '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change</em>'.
	 * @generated
	 */
	Change createChange();

		FeatureMapEntry createFeatureMapEntry(EStructuralFeature feature, Object value);

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ChangePackage getChangePackage();

  Map.Entry<EObject, EList<FeatureChange>> createEObjectToChangesMapEntry(EObject eObject);

} //ChangeFactory
