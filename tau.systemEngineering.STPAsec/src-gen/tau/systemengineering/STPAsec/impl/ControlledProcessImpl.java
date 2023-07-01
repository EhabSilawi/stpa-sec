/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getControledProcessSendsInfo <em>Controled Process Sends Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledProcessImpl extends ControlStructureElementImpl implements ControlledProcess {
	/**
	 * The cached value of the '{@link #getSendsFeedbacks() <em>Sends Feedbacks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected Feedback sendsFeedbacks;

	/**
	 * The cached value of the '{@link #getControledProcessSendsInfo() <em>Controled Process Sends Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProcessSendsInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInformation> controledProcessSendsInfo;

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
	public Feedback getSendsFeedbacks() {
		if (sendsFeedbacks != null && sendsFeedbacks.eIsProxy()) {
			InternalEObject oldSendsFeedbacks = (InternalEObject) sendsFeedbacks;
			sendsFeedbacks = (Feedback) eResolveProxy(oldSendsFeedbacks);
			if (sendsFeedbacks != oldSendsFeedbacks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS, oldSendsFeedbacks, sendsFeedbacks));
			}
		}
		return sendsFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback basicGetSendsFeedbacks() {
		return sendsFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendsFeedbacks(Feedback newSendsFeedbacks) {
		Feedback oldSendsFeedbacks = sendsFeedbacks;
		sendsFeedbacks = newSendsFeedbacks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS,
					oldSendsFeedbacks, sendsFeedbacks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getControledProcessSendsInfo() {
		if (controledProcessSendsInfo == null) {
			controledProcessSendsInfo = new EObjectWithInverseResolvingEList<OtherInformation>(OtherInformation.class,
					this, STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO,
					STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO);
		}
		return controledProcessSendsInfo;
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
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControledProcessSendsInfo())
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
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO:
			return ((InternalEList<?>) getControledProcessSendsInfo()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			if (resolve)
				return getSendsFeedbacks();
			return basicGetSendsFeedbacks();
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO:
			return getControledProcessSendsInfo();
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			setSendsFeedbacks((Feedback) newValue);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO:
			getControledProcessSendsInfo().clear();
			getControledProcessSendsInfo().addAll((Collection<? extends OtherInformation>) newValue);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			setSendsFeedbacks((Feedback) null);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO:
			getControledProcessSendsInfo().clear();
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			return sendsFeedbacks != null;
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO:
			return controledProcessSendsInfo != null && !controledProcessSendsInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlledProcessImpl
