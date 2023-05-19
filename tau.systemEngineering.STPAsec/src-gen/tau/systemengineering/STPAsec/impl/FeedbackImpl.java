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
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getController <em>Controller</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControlledProcess <em>Controlled Process</em>}</li>
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
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * The cached value of the '{@link #getControlledProcess() <em>Controlled Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess controlledProcess;

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
	public Controller getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject) controller;
			controller = (Controller) eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.FEEDBACK__CONTROLLER,
							oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.FEEDBACK__CONTROLLER, oldController, newController);
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
	public void setController(Controller newController) {
		if (newController != controller) {
			NotificationChain msgs = null;
			if (controller != null)
				msgs = ((InternalEObject) controller).eInverseRemove(this, STPAsecPackage.CONTROLLER__FEEDBACKS,
						Controller.class, msgs);
			if (newController != null)
				msgs = ((InternalEObject) newController).eInverseAdd(this, STPAsecPackage.CONTROLLER__FEEDBACKS,
						Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK__CONTROLLER, newController,
					newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess getControlledProcess() {
		if (controlledProcess != null && controlledProcess.eIsProxy()) {
			InternalEObject oldControlledProcess = (InternalEObject) controlledProcess;
			controlledProcess = (ControlledProcess) eResolveProxy(oldControlledProcess);
			if (controlledProcess != oldControlledProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS, oldControlledProcess, controlledProcess));
			}
		}
		return controlledProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetControlledProcess() {
		return controlledProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledProcess(ControlledProcess newControlledProcess, NotificationChain msgs) {
		ControlledProcess oldControlledProcess = controlledProcess;
		controlledProcess = newControlledProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS, oldControlledProcess, newControlledProcess);
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
	public void setControlledProcess(ControlledProcess newControlledProcess) {
		if (newControlledProcess != controlledProcess) {
			NotificationChain msgs = null;
			if (controlledProcess != null)
				msgs = ((InternalEObject) controlledProcess).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS, ControlledProcess.class, msgs);
			if (newControlledProcess != null)
				msgs = ((InternalEObject) newControlledProcess).eInverseAdd(this,
						STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS, ControlledProcess.class, msgs);
			msgs = basicSetControlledProcess(newControlledProcess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS,
					newControlledProcess, newControlledProcess));
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
		case STPAsecPackage.FEEDBACK__CONTROLLER:
			if (controller != null)
				msgs = ((InternalEObject) controller).eInverseRemove(this, STPAsecPackage.CONTROLLER__FEEDBACKS,
						Controller.class, msgs);
			return basicSetController((Controller) otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS:
			if (controlledProcess != null)
				msgs = ((InternalEObject) controlledProcess).eInverseRemove(this,
						STPAsecPackage.CONTROLLED_PROCESS__FEEDBACKS, ControlledProcess.class, msgs);
			return basicSetControlledProcess((ControlledProcess) otherEnd, msgs);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER:
			return basicSetController(null, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS:
			return basicSetControlledProcess(null, msgs);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER:
			if (resolve)
				return getController();
			return basicGetController();
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS:
			if (resolve)
				return getControlledProcess();
			return basicGetControlledProcess();
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
		case STPAsecPackage.FEEDBACK__CONTROLLER:
			setController((Controller) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS:
			setControlledProcess((ControlledProcess) newValue);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER:
			setController((Controller) null);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS:
			setControlledProcess((ControlledProcess) null);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER:
			return controller != null;
		case STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS:
			return controlledProcess != null;
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
