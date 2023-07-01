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

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControllerCommandReceiver <em>Controller Command Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControledProccessReceiverCommands <em>Controled Proccess Receiver Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlActionImpl extends ControlStructureElementImpl implements ControlAction {
	/**
	 * The cached value of the '{@link #getControllerCommandReceiver() <em>Controller Command Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerCommandReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> controllerCommandReceiver;

	/**
	 * The cached value of the '{@link #getControledProccessReceiverCommands() <em>Controled Proccess Receiver Commands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProccessReceiverCommands()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess controledProccessReceiverCommands;

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
	public EList<ControlStructure> getControllerCommandReceiver() {
		if (controllerCommandReceiver == null) {
			controllerCommandReceiver = new EObjectWithInverseResolvingEList<ControlStructure>(ControlStructure.class,
					this, STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER,
					STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS);
		}
		return controllerCommandReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess getControledProccessReceiverCommands() {
		if (controledProccessReceiverCommands != null && controledProccessReceiverCommands.eIsProxy()) {
			InternalEObject oldControledProccessReceiverCommands = (InternalEObject) controledProccessReceiverCommands;
			controledProccessReceiverCommands = (ControlledProcess) eResolveProxy(oldControledProccessReceiverCommands);
			if (controledProccessReceiverCommands != oldControledProccessReceiverCommands) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS,
							oldControledProccessReceiverCommands, controledProccessReceiverCommands));
			}
		}
		return controledProccessReceiverCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetControledProccessReceiverCommands() {
		return controledProccessReceiverCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControledProccessReceiverCommands(ControlledProcess newControledProccessReceiverCommands) {
		ControlledProcess oldControledProccessReceiverCommands = controledProccessReceiverCommands;
		controledProccessReceiverCommands = newControledProccessReceiverCommands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS,
					oldControledProccessReceiverCommands, controledProccessReceiverCommands));
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerCommandReceiver())
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER:
			return ((InternalEList<?>) getControllerCommandReceiver()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER:
			return getControllerCommandReceiver();
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS:
			if (resolve)
				return getControledProccessReceiverCommands();
			return basicGetControledProccessReceiverCommands();
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER:
			getControllerCommandReceiver().clear();
			getControllerCommandReceiver().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS:
			setControledProccessReceiverCommands((ControlledProcess) newValue);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER:
			getControllerCommandReceiver().clear();
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS:
			setControledProccessReceiverCommands((ControlledProcess) null);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER:
			return controllerCommandReceiver != null && !controllerCommandReceiver.isEmpty();
		case STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS:
			return controledProccessReceiverCommands != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlActionImpl
