/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControllerFeedbackReceiver <em>Controller Feedback Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends ControlStructureElementImpl implements Feedback {
	/**
	 * The cached value of the '{@link #getControllerFeedbackReceiver() <em>Controller Feedback Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerFeedbackReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> controllerFeedbackReceiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getControllerFeedbackReceiver() {
		if (controllerFeedbackReceiver == null) {
			controllerFeedbackReceiver = new EObjectWithInverseResolvingEList<ControlStructure>(ControlStructure.class,
					this, STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER,
					STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS);
		}
		return controllerFeedbackReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerFeedbackReceiver())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER:
			return ((InternalEList<?>) getControllerFeedbackReceiver()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER:
			return getControllerFeedbackReceiver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER:
			getControllerFeedbackReceiver().clear();
			getControllerFeedbackReceiver().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER:
			getControllerFeedbackReceiver().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER:
			return controllerFeedbackReceiver != null && !controllerFeedbackReceiver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeedbackImpl
