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

import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getCcontrollerReceiverInfo <em>Ccontroller Receiver Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getControledProcessRecevierInfo <em>Controled Process Recevier Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherInformationImpl extends ControlStructureElementImpl implements OtherInformation {
	/**
	 * The cached value of the '{@link #getCcontrollerReceiverInfo() <em>Ccontroller Receiver Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcontrollerReceiverInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> ccontrollerReceiverInfo;

	/**
	 * The cached value of the '{@link #getControledProcessRecevierInfo() <em>Controled Process Recevier Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProcessRecevierInfo()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess controledProcessRecevierInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.OTHER_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getCcontrollerReceiverInfo() {
		if (ccontrollerReceiverInfo == null) {
			ccontrollerReceiverInfo = new EObjectWithInverseResolvingEList.ManyInverse<ControlStructure>(
					ControlStructure.class, this, STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO,
					STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO);
		}
		return ccontrollerReceiverInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess getControledProcessRecevierInfo() {
		if (controledProcessRecevierInfo != null && controledProcessRecevierInfo.eIsProxy()) {
			InternalEObject oldControledProcessRecevierInfo = (InternalEObject) controledProcessRecevierInfo;
			controledProcessRecevierInfo = (ControlledProcess) eResolveProxy(oldControledProcessRecevierInfo);
			if (controledProcessRecevierInfo != oldControledProcessRecevierInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO,
							oldControledProcessRecevierInfo, controledProcessRecevierInfo));
			}
		}
		return controledProcessRecevierInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetControledProcessRecevierInfo() {
		return controledProcessRecevierInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControledProcessRecevierInfo(ControlledProcess newControledProcessRecevierInfo,
			NotificationChain msgs) {
		ControlledProcess oldControledProcessRecevierInfo = controledProcessRecevierInfo;
		controledProcessRecevierInfo = newControledProcessRecevierInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO, oldControledProcessRecevierInfo,
					newControledProcessRecevierInfo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControledProcessRecevierInfo(ControlledProcess newControledProcessRecevierInfo) {
		if (newControledProcessRecevierInfo != controledProcessRecevierInfo) {
			NotificationChain msgs = null;
			if (controledProcessRecevierInfo != null)
				msgs = ((InternalEObject) controledProcessRecevierInfo).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO, ControlledProcess.class, msgs);
			if (newControledProcessRecevierInfo != null)
				msgs = ((InternalEObject) newControledProcessRecevierInfo).eInverseAdd(this,
						STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO, ControlledProcess.class, msgs);
			msgs = basicSetControledProcessRecevierInfo(newControledProcessRecevierInfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO, newControledProcessRecevierInfo,
					newControledProcessRecevierInfo));
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
		case STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCcontrollerReceiverInfo()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO:
			if (controledProcessRecevierInfo != null)
				msgs = ((InternalEObject) controledProcessRecevierInfo).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO, ControlledProcess.class, msgs);
			return basicSetControledProcessRecevierInfo((ControlledProcess) otherEnd, msgs);
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
		case STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO:
			return ((InternalEList<?>) getCcontrollerReceiverInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO:
			return basicSetControledProcessRecevierInfo(null, msgs);
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
		case STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO:
			return getCcontrollerReceiverInfo();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO:
			if (resolve)
				return getControledProcessRecevierInfo();
			return basicGetControledProcessRecevierInfo();
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
		case STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO:
			getCcontrollerReceiverInfo().clear();
			getCcontrollerReceiverInfo().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO:
			setControledProcessRecevierInfo((ControlledProcess) newValue);
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
		case STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO:
			getCcontrollerReceiverInfo().clear();
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO:
			setControledProcessRecevierInfo((ControlledProcess) null);
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
		case STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO:
			return ccontrollerReceiverInfo != null && !ccontrollerReceiverInfo.isEmpty();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO:
			return controledProcessRecevierInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //OtherInformationImpl
