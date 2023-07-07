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
import tau.systemengineering.STPAsec.Controller;
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
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getControllerSenders <em>Controller Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getControledProcessSenders <em>Controled Process Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getControledProcessReceivers <em>Controled Process Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getControllerReceivers <em>Controller Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getSubsystemSenders <em>Subsystem Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl#getSubsystemReceivers <em>Subsystem Receivers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherInformationImpl extends ControlStructureElementImpl implements OtherInformation {
	/**
	 * The cached value of the '{@link #getControllerSenders() <em>Controller Senders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllerSenders;

	/**
	 * The cached value of the '{@link #getControledProcessSenders() <em>Controled Process Senders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProcessSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledProcess> controledProcessSenders;

	/**
	 * The cached value of the '{@link #getControledProcessReceivers() <em>Controled Process Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProcessReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledProcess> controledProcessReceivers;

	/**
	 * The cached value of the '{@link #getControllerReceivers() <em>Controller Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllerReceivers;

	/**
	 * The cached value of the '{@link #getSubsystemSenders() <em>Subsystem Senders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> subsystemSenders;

	/**
	 * The cached value of the '{@link #getSubsystemReceivers() <em>Subsystem Receivers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemReceivers()
	 * @generated
	 * @ordered
	 */
	protected ControlStructure subsystemReceivers;

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
	public EList<Controller> getControllerSenders() {
		if (controllerSenders == null) {
			controllerSenders = new EObjectWithInverseResolvingEList.ManyInverse<Controller>(Controller.class, this,
					STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS, STPAsecPackage.CONTROLLER__SENDS_INFO);
		}
		return controllerSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledProcess> getControledProcessSenders() {
		if (controledProcessSenders == null) {
			controledProcessSenders = new EObjectWithInverseResolvingEList.ManyInverse<ControlledProcess>(
					ControlledProcess.class, this, STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS,
					STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO);
		}
		return controledProcessSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledProcess> getControledProcessReceivers() {
		if (controledProcessReceivers == null) {
			controledProcessReceivers = new EObjectWithInverseResolvingEList.ManyInverse<ControlledProcess>(
					ControlledProcess.class, this, STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS,
					STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO);
		}
		return controledProcessReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllerReceivers() {
		if (controllerReceivers == null) {
			controllerReceivers = new EObjectWithInverseResolvingEList.ManyInverse<Controller>(Controller.class, this,
					STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS, STPAsecPackage.CONTROLLER__RECEIVES_INFO);
		}
		return controllerReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getSubsystemSenders() {
		if (subsystemSenders == null) {
			subsystemSenders = new EObjectWithInverseResolvingEList.ManyInverse<ControlStructure>(
					ControlStructure.class, this, STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS,
					STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR);
		}
		return subsystemSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStructure getSubsystemReceivers() {
		if (subsystemReceivers != null && subsystemReceivers.eIsProxy()) {
			InternalEObject oldSubsystemReceivers = (InternalEObject) subsystemReceivers;
			subsystemReceivers = (ControlStructure) eResolveProxy(oldSubsystemReceivers);
			if (subsystemReceivers != oldSubsystemReceivers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS, oldSubsystemReceivers,
							subsystemReceivers));
			}
		}
		return subsystemReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStructure basicGetSubsystemReceivers() {
		return subsystemReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsystemReceivers(ControlStructure newSubsystemReceivers,
			NotificationChain msgs) {
		ControlStructure oldSubsystemReceivers = subsystemReceivers;
		subsystemReceivers = newSubsystemReceivers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS, oldSubsystemReceivers,
					newSubsystemReceivers);
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
	public void setSubsystemReceivers(ControlStructure newSubsystemReceivers) {
		if (newSubsystemReceivers != subsystemReceivers) {
			NotificationChain msgs = null;
			if (subsystemReceivers != null)
				msgs = ((InternalEObject) subsystemReceivers).eInverseRemove(this,
						STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO, ControlStructure.class, msgs);
			if (newSubsystemReceivers != null)
				msgs = ((InternalEObject) newSubsystemReceivers).eInverseAdd(this,
						STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO, ControlStructure.class, msgs);
			msgs = basicSetSubsystemReceivers(newSubsystemReceivers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS,
					newSubsystemReceivers, newSubsystemReceivers));
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
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerSenders()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControledProcessSenders()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControledProcessReceivers())
					.basicAdd(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerReceivers()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubsystemSenders()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS:
			if (subsystemReceivers != null)
				msgs = ((InternalEObject) subsystemReceivers).eInverseRemove(this,
						STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO, ControlStructure.class, msgs);
			return basicSetSubsystemReceivers((ControlStructure) otherEnd, msgs);
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
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS:
			return ((InternalEList<?>) getControllerSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS:
			return ((InternalEList<?>) getControledProcessSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS:
			return ((InternalEList<?>) getControledProcessReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS:
			return ((InternalEList<?>) getControllerReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS:
			return ((InternalEList<?>) getSubsystemSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS:
			return basicSetSubsystemReceivers(null, msgs);
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
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS:
			return getControllerSenders();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS:
			return getControledProcessSenders();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS:
			return getControledProcessReceivers();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS:
			return getControllerReceivers();
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS:
			return getSubsystemSenders();
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS:
			if (resolve)
				return getSubsystemReceivers();
			return basicGetSubsystemReceivers();
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
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS:
			getControllerSenders().clear();
			getControllerSenders().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS:
			getControledProcessSenders().clear();
			getControledProcessSenders().addAll((Collection<? extends ControlledProcess>) newValue);
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS:
			getControledProcessReceivers().clear();
			getControledProcessReceivers().addAll((Collection<? extends ControlledProcess>) newValue);
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS:
			getControllerReceivers().clear();
			getControllerReceivers().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS:
			getSubsystemSenders().clear();
			getSubsystemSenders().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS:
			setSubsystemReceivers((ControlStructure) newValue);
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
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS:
			getControllerSenders().clear();
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS:
			getControledProcessSenders().clear();
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS:
			getControledProcessReceivers().clear();
			return;
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS:
			getControllerReceivers().clear();
			return;
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS:
			getSubsystemSenders().clear();
			return;
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS:
			setSubsystemReceivers((ControlStructure) null);
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
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS:
			return controllerSenders != null && !controllerSenders.isEmpty();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS:
			return controledProcessSenders != null && !controledProcessSenders.isEmpty();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS:
			return controledProcessReceivers != null && !controledProcessReceivers.isEmpty();
		case STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS:
			return controllerReceivers != null && !controllerReceivers.isEmpty();
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS:
			return subsystemSenders != null && !subsystemSenders.isEmpty();
		case STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS:
			return subsystemReceivers != null;
		}
		return super.eIsSet(featureID);
	}

} //OtherInformationImpl
