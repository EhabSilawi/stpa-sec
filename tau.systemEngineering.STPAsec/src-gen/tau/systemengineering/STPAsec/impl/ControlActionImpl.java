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
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControllerReceiver <em>Controller Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getContollerSender <em>Contoller Sender</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getControlledProcessReceiver <em>Controlled Process Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlActionImpl extends DataFlowImpl implements ControlAction {
	/**
	 * The cached value of the '{@link #getControllerReceiver() <em>Controller Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerReceiver()
	 * @generated
	 * @ordered
	 */
	protected Controller controllerReceiver;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * The cached value of the '{@link #getContollerSender() <em>Contoller Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContollerSender()
	 * @generated
	 * @ordered
	 */
	protected Controller contollerSender;

	/**
	 * The cached value of the '{@link #getControlledProcessReceiver() <em>Controlled Process Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledProcessReceiver()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess controlledProcessReceiver;

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
	public Controller getControllerReceiver() {
		if (controllerReceiver != null && controllerReceiver.eIsProxy()) {
			InternalEObject oldControllerReceiver = (InternalEObject) controllerReceiver;
			controllerReceiver = (Controller) eResolveProxy(oldControllerReceiver);
			if (controllerReceiver != oldControllerReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER, oldControllerReceiver,
							controllerReceiver));
			}
		}
		return controllerReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetControllerReceiver() {
		return controllerReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllerReceiver(Controller newControllerReceiver, NotificationChain msgs) {
		Controller oldControllerReceiver = controllerReceiver;
		controllerReceiver = newControllerReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER, oldControllerReceiver, newControllerReceiver);
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
	public void setControllerReceiver(Controller newControllerReceiver) {
		if (newControllerReceiver != controllerReceiver) {
			NotificationChain msgs = null;
			if (controllerReceiver != null)
				msgs = ((InternalEObject) controllerReceiver).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__RECEIVED_COMMANDS, Controller.class, msgs);
			if (newControllerReceiver != null)
				msgs = ((InternalEObject) newControllerReceiver).eInverseAdd(this,
						STPAsecPackage.CONTROLLER__RECEIVED_COMMANDS, Controller.class, msgs);
			msgs = basicSetControllerReceiver(newControllerReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER,
					newControllerReceiver, newControllerReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectWithInverseResolvingEList.ManyInverse<Hazard>(Hazard.class, this,
					STPAsecPackage.CONTROL_ACTION__HAZARDS, STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTIONS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getContollerSender() {
		if (contollerSender != null && contollerSender.eIsProxy()) {
			InternalEObject oldContollerSender = (InternalEObject) contollerSender;
			contollerSender = (Controller) eResolveProxy(oldContollerSender);
			if (contollerSender != oldContollerSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER, oldContollerSender, contollerSender));
			}
		}
		return contollerSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetContollerSender() {
		return contollerSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContollerSender(Controller newContollerSender, NotificationChain msgs) {
		Controller oldContollerSender = contollerSender;
		contollerSender = newContollerSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER, oldContollerSender, newContollerSender);
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
	public void setContollerSender(Controller newContollerSender) {
		if (newContollerSender != contollerSender) {
			NotificationChain msgs = null;
			if (contollerSender != null)
				msgs = ((InternalEObject) contollerSender).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__SENT_COMMANDS, Controller.class, msgs);
			if (newContollerSender != null)
				msgs = ((InternalEObject) newContollerSender).eInverseAdd(this,
						STPAsecPackage.CONTROLLER__SENT_COMMANDS, Controller.class, msgs);
			msgs = basicSetContollerSender(newContollerSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER,
					newContollerSender, newContollerSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess getControlledProcessReceiver() {
		if (controlledProcessReceiver != null && controlledProcessReceiver.eIsProxy()) {
			InternalEObject oldControlledProcessReceiver = (InternalEObject) controlledProcessReceiver;
			controlledProcessReceiver = (ControlledProcess) eResolveProxy(oldControlledProcessReceiver);
			if (controlledProcessReceiver != oldControlledProcessReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER, oldControlledProcessReceiver,
							controlledProcessReceiver));
			}
		}
		return controlledProcessReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetControlledProcessReceiver() {
		return controlledProcessReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledProcessReceiver(ControlledProcess newControlledProcessReceiver,
			NotificationChain msgs) {
		ControlledProcess oldControlledProcessReceiver = controlledProcessReceiver;
		controlledProcessReceiver = newControlledProcessReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER, oldControlledProcessReceiver,
					newControlledProcessReceiver);
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
	public void setControlledProcessReceiver(ControlledProcess newControlledProcessReceiver) {
		if (newControlledProcessReceiver != controlledProcessReceiver) {
			NotificationChain msgs = null;
			if (controlledProcessReceiver != null)
				msgs = ((InternalEObject) controlledProcessReceiver).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS,
						ControlledProcess.class, msgs);
			if (newControlledProcessReceiver != null)
				msgs = ((InternalEObject) newControlledProcessReceiver).eInverseAdd(this,
						STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS,
						ControlledProcess.class, msgs);
			msgs = basicSetControlledProcessReceiver(newControlledProcessReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER, newControlledProcessReceiver,
					newControlledProcessReceiver));
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER:
			if (controllerReceiver != null)
				msgs = ((InternalEObject) controllerReceiver).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__RECEIVED_COMMANDS, Controller.class, msgs);
			return basicSetControllerReceiver((Controller) otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHazards()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER:
			if (contollerSender != null)
				msgs = ((InternalEObject) contollerSender).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__SENT_COMMANDS, Controller.class, msgs);
			return basicSetContollerSender((Controller) otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER:
			if (controlledProcessReceiver != null)
				msgs = ((InternalEObject) controlledProcessReceiver).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS,
						ControlledProcess.class, msgs);
			return basicSetControlledProcessReceiver((ControlledProcess) otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER:
			return basicSetControllerReceiver(null, msgs);
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return ((InternalEList<?>) getHazards()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER:
			return basicSetContollerSender(null, msgs);
		case STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER:
			return basicSetControlledProcessReceiver(null, msgs);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER:
			if (resolve)
				return getControllerReceiver();
			return basicGetControllerReceiver();
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return getHazards();
		case STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER:
			if (resolve)
				return getContollerSender();
			return basicGetContollerSender();
		case STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER:
			if (resolve)
				return getControlledProcessReceiver();
			return basicGetControlledProcessReceiver();
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER:
			setControllerReceiver((Controller) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			getHazards().clear();
			getHazards().addAll((Collection<? extends Hazard>) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER:
			setContollerSender((Controller) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER:
			setControlledProcessReceiver((ControlledProcess) newValue);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER:
			setControllerReceiver((Controller) null);
			return;
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			getHazards().clear();
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER:
			setContollerSender((Controller) null);
			return;
		case STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER:
			setControlledProcessReceiver((ControlledProcess) null);
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
		case STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVER:
			return controllerReceiver != null;
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return hazards != null && !hazards.isEmpty();
		case STPAsecPackage.CONTROL_ACTION__CONTOLLER_SENDER:
			return contollerSender != null;
		case STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER:
			return controlledProcessReceiver != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlActionImpl
