/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
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
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControllerReceiver <em>Controller Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControlledProcessSender <em>Controlled Process Sender</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControllerSender <em>Controller Sender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends DataFlowImpl implements Feedback {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getControlledProcessSender() <em>Controlled Process Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledProcessSender()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess controlledProcessSender;

	/**
	 * The cached value of the '{@link #getControllerSender() <em>Controller Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerSender()
	 * @generated
	 * @ordered
	 */
	protected Controller controllerSender;

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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK__TYPE, oldType, type));
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
							STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER, oldControllerReceiver, controllerReceiver));
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
					STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER, oldControllerReceiver, newControllerReceiver);
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
						STPAsecPackage.CONTROLLER__RECEIVED_FEEDBACKS, Controller.class, msgs);
			if (newControllerReceiver != null)
				msgs = ((InternalEObject) newControllerReceiver).eInverseAdd(this,
						STPAsecPackage.CONTROLLER__RECEIVED_FEEDBACKS, Controller.class, msgs);
			msgs = basicSetControllerReceiver(newControllerReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER,
					newControllerReceiver, newControllerReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess getControlledProcessSender() {
		if (controlledProcessSender != null && controlledProcessSender.eIsProxy()) {
			InternalEObject oldControlledProcessSender = (InternalEObject) controlledProcessSender;
			controlledProcessSender = (ControlledProcess) eResolveProxy(oldControlledProcessSender);
			if (controlledProcessSender != oldControlledProcessSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER, oldControlledProcessSender,
							controlledProcessSender));
			}
		}
		return controlledProcessSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetControlledProcessSender() {
		return controlledProcessSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledProcessSender(ControlledProcess newControlledProcessSender,
			NotificationChain msgs) {
		ControlledProcess oldControlledProcessSender = controlledProcessSender;
		controlledProcessSender = newControlledProcessSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER, oldControlledProcessSender,
					newControlledProcessSender);
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
	public void setControlledProcessSender(ControlledProcess newControlledProcessSender) {
		if (newControlledProcessSender != controlledProcessSender) {
			NotificationChain msgs = null;
			if (controlledProcessSender != null)
				msgs = ((InternalEObject) controlledProcessSender).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS, ControlledProcess.class, msgs);
			if (newControlledProcessSender != null)
				msgs = ((InternalEObject) newControlledProcessSender).eInverseAdd(this,
						STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS, ControlledProcess.class, msgs);
			msgs = basicSetControlledProcessSender(newControlledProcessSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER,
					newControlledProcessSender, newControlledProcessSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getControllerSender() {
		if (controllerSender != null && controllerSender.eIsProxy()) {
			InternalEObject oldControllerSender = (InternalEObject) controllerSender;
			controllerSender = (Controller) eResolveProxy(oldControllerSender);
			if (controllerSender != oldControllerSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.FEEDBACK__CONTROLLER_SENDER, oldControllerSender, controllerSender));
			}
		}
		return controllerSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetControllerSender() {
		return controllerSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllerSender(Controller newControllerSender, NotificationChain msgs) {
		Controller oldControllerSender = controllerSender;
		controllerSender = newControllerSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.FEEDBACK__CONTROLLER_SENDER, oldControllerSender, newControllerSender);
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
	public void setControllerSender(Controller newControllerSender) {
		if (newControllerSender != controllerSender) {
			NotificationChain msgs = null;
			if (controllerSender != null)
				msgs = ((InternalEObject) controllerSender).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__SENT_FEEDBACKS, Controller.class, msgs);
			if (newControllerSender != null)
				msgs = ((InternalEObject) newControllerSender).eInverseAdd(this,
						STPAsecPackage.CONTROLLER__SENT_FEEDBACKS, Controller.class, msgs);
			msgs = basicSetControllerSender(newControllerSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK__CONTROLLER_SENDER,
					newControllerSender, newControllerSender));
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER:
			if (controllerReceiver != null)
				msgs = ((InternalEObject) controllerReceiver).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__RECEIVED_FEEDBACKS, Controller.class, msgs);
			return basicSetControllerReceiver((Controller) otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER:
			if (controlledProcessSender != null)
				msgs = ((InternalEObject) controlledProcessSender).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS, ControlledProcess.class, msgs);
			return basicSetControlledProcessSender((ControlledProcess) otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDER:
			if (controllerSender != null)
				msgs = ((InternalEObject) controllerSender).eInverseRemove(this,
						STPAsecPackage.CONTROLLER__SENT_FEEDBACKS, Controller.class, msgs);
			return basicSetControllerSender((Controller) otherEnd, msgs);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER:
			return basicSetControllerReceiver(null, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER:
			return basicSetControlledProcessSender(null, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDER:
			return basicSetControllerSender(null, msgs);
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
		case STPAsecPackage.FEEDBACK__TYPE:
			return getType();
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER:
			if (resolve)
				return getControllerReceiver();
			return basicGetControllerReceiver();
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER:
			if (resolve)
				return getControlledProcessSender();
			return basicGetControlledProcessSender();
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDER:
			if (resolve)
				return getControllerSender();
			return basicGetControllerSender();
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
		case STPAsecPackage.FEEDBACK__TYPE:
			setType((String) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER:
			setControllerReceiver((Controller) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER:
			setControlledProcessSender((ControlledProcess) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDER:
			setControllerSender((Controller) newValue);
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
		case STPAsecPackage.FEEDBACK__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER:
			setControllerReceiver((Controller) null);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER:
			setControlledProcessSender((ControlledProcess) null);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDER:
			setControllerSender((Controller) null);
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
		case STPAsecPackage.FEEDBACK__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVER:
			return controllerReceiver != null;
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER:
			return controlledProcessSender != null;
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDER:
			return controllerSender != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FeedbackImpl
