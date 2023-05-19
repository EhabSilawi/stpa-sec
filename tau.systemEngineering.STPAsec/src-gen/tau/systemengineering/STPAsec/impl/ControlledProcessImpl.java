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
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getFeedbacks <em>Feedbacks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledProcessImpl extends StructureElementImpl implements ControlledProcess {
	/**
	 * The cached value of the '{@link #getFeedbacks() <em>Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedbacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlledProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROLLED_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedbacks() {
		if (feedbacks == null) {
			feedbacks = new EObjectWithInverseResolvingEList<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS, STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS);
		}
		return feedbacks;
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
		case STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeedbacks()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS:
			return ((InternalEList<?>) getFeedbacks()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS:
			return getFeedbacks();
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
		case STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS:
			getFeedbacks().clear();
			getFeedbacks().addAll((Collection<? extends Feedback>) newValue);
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
		case STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS:
			getFeedbacks().clear();
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
		case STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS:
			return feedbacks != null && !feedbacks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlledProcessImpl
