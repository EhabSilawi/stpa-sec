/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.CmdFlow;
import tau.systemengineering.STPAsec.ControlLoop;
import tau.systemengineering.STPAsec.FeedbackFlow;
import tau.systemengineering.STPAsec.InfoFlow;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlLoopImpl#getCmdflow <em>Cmdflow</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlLoopImpl#getFeedbackflow <em>Feedbackflow</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlLoopImpl#getInfoflow <em>Infoflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlLoopImpl extends MinimalEObjectImpl.Container implements ControlLoop {
	/**
	 * The cached value of the '{@link #getCmdflow() <em>Cmdflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdflow()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdFlow> cmdflow;

	/**
	 * The cached value of the '{@link #getFeedbackflow() <em>Feedbackflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackflow()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackFlow> feedbackflow;

	/**
	 * The cached value of the '{@link #getInfoflow() <em>Infoflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoflow()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoFlow> infoflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROL_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmdFlow> getCmdflow() {
		if (cmdflow == null) {
			cmdflow = new EObjectContainmentEList<CmdFlow>(CmdFlow.class, this, STPAsecPackage.CONTROL_LOOP__CMDFLOW);
		}
		return cmdflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeedbackFlow> getFeedbackflow() {
		if (feedbackflow == null) {
			feedbackflow = new EObjectContainmentEList<FeedbackFlow>(FeedbackFlow.class, this,
					STPAsecPackage.CONTROL_LOOP__FEEDBACKFLOW);
		}
		return feedbackflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoFlow> getInfoflow() {
		if (infoflow == null) {
			infoflow = new EObjectContainmentEList<InfoFlow>(InfoFlow.class, this,
					STPAsecPackage.CONTROL_LOOP__INFOFLOW);
		}
		return infoflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.CONTROL_LOOP__CMDFLOW:
			return ((InternalEList<?>) getCmdflow()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_LOOP__FEEDBACKFLOW:
			return ((InternalEList<?>) getFeedbackflow()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_LOOP__INFOFLOW:
			return ((InternalEList<?>) getInfoflow()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_LOOP__CMDFLOW:
			return getCmdflow();
		case STPAsecPackage.CONTROL_LOOP__FEEDBACKFLOW:
			return getFeedbackflow();
		case STPAsecPackage.CONTROL_LOOP__INFOFLOW:
			return getInfoflow();
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
		case STPAsecPackage.CONTROL_LOOP__CMDFLOW:
			getCmdflow().clear();
			getCmdflow().addAll((Collection<? extends CmdFlow>) newValue);
			return;
		case STPAsecPackage.CONTROL_LOOP__FEEDBACKFLOW:
			getFeedbackflow().clear();
			getFeedbackflow().addAll((Collection<? extends FeedbackFlow>) newValue);
			return;
		case STPAsecPackage.CONTROL_LOOP__INFOFLOW:
			getInfoflow().clear();
			getInfoflow().addAll((Collection<? extends InfoFlow>) newValue);
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
		case STPAsecPackage.CONTROL_LOOP__CMDFLOW:
			getCmdflow().clear();
			return;
		case STPAsecPackage.CONTROL_LOOP__FEEDBACKFLOW:
			getFeedbackflow().clear();
			return;
		case STPAsecPackage.CONTROL_LOOP__INFOFLOW:
			getInfoflow().clear();
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
		case STPAsecPackage.CONTROL_LOOP__CMDFLOW:
			return cmdflow != null && !cmdflow.isEmpty();
		case STPAsecPackage.CONTROL_LOOP__FEEDBACKFLOW:
			return feedbackflow != null && !feedbackflow.isEmpty();
		case STPAsecPackage.CONTROL_LOOP__INFOFLOW:
			return infoflow != null && !infoflow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlLoopImpl
