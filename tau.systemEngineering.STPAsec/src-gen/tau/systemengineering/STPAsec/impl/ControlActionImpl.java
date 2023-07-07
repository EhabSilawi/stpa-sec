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

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControllerSenders <em>Controller Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControllerReceivers <em>Controller Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControledProccessReceivers <em>Controled Proccess Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getSubsystemSenders <em>Subsystem Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getSubsystemReceivers <em>Subsystem Receivers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlActionImpl extends ControlStructureElementImpl implements ControlAction {
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
	 * The cached value of the '{@link #getControllerReceivers() <em>Controller Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllerReceivers;

	/**
	 * The cached value of the '{@link #getControledProccessReceivers() <em>Controled Proccess Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProccessReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledProcess> controledProccessReceivers;

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
	 * The cached value of the '{@link #getSubsystemReceivers() <em>Subsystem Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> subsystemReceivers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllerSenders() {
		if (controllerSenders == null) {
			controllerSenders = new EObjectWithInverseResolvingEList.ManyInverse<Controller>(Controller.class, this,
					STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS, STPAsecPackage.CONTROLLER__SENDS_COMMANDS);
		}
		return controllerSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllerReceivers() {
		if (controllerReceivers == null) {
			controllerReceivers = new EObjectWithInverseResolvingEList.ManyInverse<Controller>(Controller.class, this,
					STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS, STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS);
		}
		return controllerReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledProcess> getControledProccessReceivers() {
		if (controledProccessReceivers == null) {
			controledProccessReceivers = new EObjectWithInverseResolvingEList.ManyInverse<ControlledProcess>(
					ControlledProcess.class, this, STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS,
					STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS);
		}
		return controledProccessReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getSubsystemSenders() {
		if (subsystemSenders == null) {
			subsystemSenders = new EObjectWithInverseResolvingEList.ManyInverse<ControlStructure>(
					ControlStructure.class, this, STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS,
					STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS);
		}
		return subsystemSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getSubsystemReceivers() {
		if (subsystemReceivers == null) {
			subsystemReceivers = new EObjectWithInverseResolvingEList.ManyInverse<ControlStructure>(
					ControlStructure.class, this, STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS,
					STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS);
		}
		return subsystemReceivers;
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerSenders()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerReceivers()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControledProccessReceivers())
					.basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubsystemSenders()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubsystemReceivers()).basicAdd(otherEnd,
					msgs);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS:
			return ((InternalEList<?>) getControllerSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS:
			return ((InternalEList<?>) getControllerReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS:
			return ((InternalEList<?>) getControledProccessReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS:
			return ((InternalEList<?>) getSubsystemSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS:
			return ((InternalEList<?>) getSubsystemReceivers()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS:
			return getControllerSenders();
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS:
			return getControllerReceivers();
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS:
			return getControledProccessReceivers();
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS:
			return getSubsystemSenders();
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS:
			return getSubsystemReceivers();
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS:
			getControllerSenders().clear();
			getControllerSenders().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS:
			getControllerReceivers().clear();
			getControllerReceivers().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS:
			getControledProccessReceivers().clear();
			getControledProccessReceivers().addAll((Collection<? extends ControlledProcess>) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS:
			getSubsystemSenders().clear();
			getSubsystemSenders().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS:
			getSubsystemReceivers().clear();
			getSubsystemReceivers().addAll((Collection<? extends ControlStructure>) newValue);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS:
			getControllerSenders().clear();
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS:
			getControllerReceivers().clear();
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS:
			getControledProccessReceivers().clear();
			return;
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS:
			getSubsystemSenders().clear();
			return;
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS:
			getSubsystemReceivers().clear();
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS:
			return controllerSenders != null && !controllerSenders.isEmpty();
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS:
			return controllerReceivers != null && !controllerReceivers.isEmpty();
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS:
			return controledProccessReceivers != null && !controledProccessReceivers.isEmpty();
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS:
			return subsystemSenders != null && !subsystemSenders.isEmpty();
		case STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS:
			return subsystemReceivers != null && !subsystemReceivers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlActionImpl
