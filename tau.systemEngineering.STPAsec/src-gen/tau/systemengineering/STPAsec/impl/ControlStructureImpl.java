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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getModelGoal <em>Model Goal</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getControlledprocess <em>Controlledprocess</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getControlaction <em>Controlaction</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSendsCommands <em>Sends Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getControllerSendsInfo <em>Controller Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlStructureImpl extends MinimalEObjectImpl.Container implements ControlStructure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelGoal() <em>Model Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelGoal() <em>Model Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGoal()
	 * @generated
	 * @ordered
	 */
	protected String modelGoal = MODEL_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlledprocess() <em>Controlledprocess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledProcess> controlledprocess;

	/**
	 * The cached value of the '{@link #getControlaction() <em>Controlaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> controlaction;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedback;

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
	 * The cached value of the '{@link #getSendsCommands() <em>Sends Commands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsCommands()
	 * @generated
	 * @ordered
	 */
	protected ControlAction sendsCommands;

	/**
	 * The cached value of the '{@link #getControllerSendsInfo() <em>Controller Sends Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerSendsInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInformation> controllerSendsInfo;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<tau.systemengineering.STPAsec.System> controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_STRUCTURE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelGoal() {
		return modelGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelGoal(String newModelGoal) {
		String oldModelGoal = modelGoal;
		modelGoal = newModelGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_STRUCTURE__MODEL_GOAL,
					oldModelGoal, modelGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_STRUCTURE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tau.systemengineering.STPAsec.System> getController() {
		if (controller == null) {
			controller = new EObjectResolvingEList<tau.systemengineering.STPAsec.System>(
					tau.systemengineering.STPAsec.System.class, this, STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledProcess> getControlledprocess() {
		if (controlledprocess == null) {
			controlledprocess = new EObjectContainmentEList<ControlledProcess>(ControlledProcess.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS);
		}
		return controlledprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getControlaction() {
		if (controlaction == null) {
			controlaction = new EObjectContainmentEList<ControlAction>(ControlAction.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION);
		}
		return controlaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectContainmentEList<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK);
		}
		return feedback;
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
							STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS, oldSendsFeedbacks, sendsFeedbacks));
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
	public NotificationChain basicSetSendsFeedbacks(Feedback newSendsFeedbacks, NotificationChain msgs) {
		Feedback oldSendsFeedbacks = sendsFeedbacks;
		sendsFeedbacks = newSendsFeedbacks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS, oldSendsFeedbacks, newSendsFeedbacks);
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
	public void setSendsFeedbacks(Feedback newSendsFeedbacks) {
		if (newSendsFeedbacks != sendsFeedbacks) {
			NotificationChain msgs = null;
			if (sendsFeedbacks != null)
				msgs = ((InternalEObject) sendsFeedbacks).eInverseRemove(this,
						STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER, Feedback.class, msgs);
			if (newSendsFeedbacks != null)
				msgs = ((InternalEObject) newSendsFeedbacks).eInverseAdd(this,
						STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER, Feedback.class, msgs);
			msgs = basicSetSendsFeedbacks(newSendsFeedbacks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS,
					newSendsFeedbacks, newSendsFeedbacks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAction getSendsCommands() {
		if (sendsCommands != null && sendsCommands.eIsProxy()) {
			InternalEObject oldSendsCommands = (InternalEObject) sendsCommands;
			sendsCommands = (ControlAction) eResolveProxy(oldSendsCommands);
			if (sendsCommands != oldSendsCommands) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS, oldSendsCommands, sendsCommands));
			}
		}
		return sendsCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAction basicGetSendsCommands() {
		return sendsCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendsCommands(ControlAction newSendsCommands, NotificationChain msgs) {
		ControlAction oldSendsCommands = sendsCommands;
		sendsCommands = newSendsCommands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS, oldSendsCommands, newSendsCommands);
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
	public void setSendsCommands(ControlAction newSendsCommands) {
		if (newSendsCommands != sendsCommands) {
			NotificationChain msgs = null;
			if (sendsCommands != null)
				msgs = ((InternalEObject) sendsCommands).eInverseRemove(this,
						STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER, ControlAction.class, msgs);
			if (newSendsCommands != null)
				msgs = ((InternalEObject) newSendsCommands).eInverseAdd(this,
						STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER, ControlAction.class, msgs);
			msgs = basicSetSendsCommands(newSendsCommands, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS,
					newSendsCommands, newSendsCommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getControllerSendsInfo() {
		if (controllerSendsInfo == null) {
			controllerSendsInfo = new EObjectWithInverseResolvingEList.ManyInverse<OtherInformation>(
					OtherInformation.class, this, STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO,
					STPAsecPackage.OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO);
		}
		return controllerSendsInfo;
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
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS:
			if (sendsFeedbacks != null)
				msgs = ((InternalEObject) sendsFeedbacks).eInverseRemove(this,
						STPAsecPackage.FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER, Feedback.class, msgs);
			return basicSetSendsFeedbacks((Feedback) otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			if (sendsCommands != null)
				msgs = ((InternalEObject) sendsCommands).eInverseRemove(this,
						STPAsecPackage.CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER, ControlAction.class, msgs);
			return basicSetSendsCommands((ControlAction) otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerSendsInfo()).basicAdd(otherEnd,
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
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
			return ((InternalEList<?>) getControlledprocess()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
			return ((InternalEList<?>) getControlaction()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
			return ((InternalEList<?>) getFeedback()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS:
			return basicSetSendsFeedbacks(null, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			return basicSetSendsCommands(null, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO:
			return ((InternalEList<?>) getControllerSendsInfo()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_STRUCTURE__NAME:
			return getName();
		case STPAsecPackage.CONTROL_STRUCTURE__MODEL_GOAL:
			return getModelGoal();
		case STPAsecPackage.CONTROL_STRUCTURE__DESCRIPTION:
			return getDescription();
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
			return getControlledprocess();
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
			return getControlaction();
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
			return getFeedback();
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS:
			if (resolve)
				return getSendsFeedbacks();
			return basicGetSendsFeedbacks();
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			if (resolve)
				return getSendsCommands();
			return basicGetSendsCommands();
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO:
			return getControllerSendsInfo();
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			return getController();
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
		case STPAsecPackage.CONTROL_STRUCTURE__NAME:
			setName((String) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__MODEL_GOAL:
			setModelGoal((String) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
			getControlledprocess().clear();
			getControlledprocess().addAll((Collection<? extends ControlledProcess>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
			getControlaction().clear();
			getControlaction().addAll((Collection<? extends ControlAction>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
			getFeedback().clear();
			getFeedback().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS:
			setSendsFeedbacks((Feedback) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			setSendsCommands((ControlAction) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO:
			getControllerSendsInfo().clear();
			getControllerSendsInfo().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			getController().clear();
			getController().addAll((Collection<? extends tau.systemengineering.STPAsec.System>) newValue);
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
		case STPAsecPackage.CONTROL_STRUCTURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__MODEL_GOAL:
			setModelGoal(MODEL_GOAL_EDEFAULT);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
			getControlledprocess().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
			getControlaction().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
			getFeedback().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS:
			setSendsFeedbacks((Feedback) null);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			setSendsCommands((ControlAction) null);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO:
			getControllerSendsInfo().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			getController().clear();
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
		case STPAsecPackage.CONTROL_STRUCTURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case STPAsecPackage.CONTROL_STRUCTURE__MODEL_GOAL:
			return MODEL_GOAL_EDEFAULT == null ? modelGoal != null : !MODEL_GOAL_EDEFAULT.equals(modelGoal);
		case STPAsecPackage.CONTROL_STRUCTURE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
			return controlledprocess != null && !controlledprocess.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
			return controlaction != null && !controlaction.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
			return feedback != null && !feedback.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_FEEDBACKS:
			return sendsFeedbacks != null;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			return sendsCommands != null;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO:
			return controllerSendsInfo != null && !controllerSendsInfo.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			return controller != null && !controller.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", modelGoal: ");
		result.append(modelGoal);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ControlStructureImpl
