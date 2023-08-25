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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.CmdFlow;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlLoop;
import tau.systemengineering.STPAsec.ControllerConstraints;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.FeedbackFlow;
import tau.systemengineering.STPAsec.InfoFlow;
import tau.systemengineering.STPAsec.Information;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getControAction <em>Contro Action</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getControlLoop <em>Control Loop</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getSendsInfo <em>Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getReceivesFeedback <em>Receives Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getSendsFeedback <em>Sends Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getControllerConstraints <em>Controller Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements tau.systemengineering.STPAsec.System {
	/**
	 * The cached value of the '{@link #getControAction() <em>Contro Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> controAction;

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
	 * The cached value of the '{@link #getControlLoop() <em>Control Loop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlLoop()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlLoop> controlLoop;

	/**
	 * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<tau.systemengineering.STPAsec.System> subSystem;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected String goal = GOAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> information;

	/**
	 * The cached value of the '{@link #getReceivesInfo() <em>Receives Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoFlow> receivesInfo;

	/**
	 * The cached value of the '{@link #getSendsInfo() <em>Sends Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoFlow> sendsInfo;

	/**
	 * The cached value of the '{@link #getReceivesFeedback() <em>Receives Feedback</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackFlow> receivesFeedback;

	/**
	 * The cached value of the '{@link #getSendsFeedback() <em>Sends Feedback</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackFlow> sendsFeedback;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdFlow> controls;

	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdFlow> performs;

	/**
	 * The cached value of the '{@link #getControllerConstraints() <em>Controller Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerConstraints> controllerConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getControAction() {
		if (controAction == null) {
			controAction = new EObjectContainmentEList<ControlAction>(ControlAction.class, this,
					STPAsecPackage.SYSTEM__CONTRO_ACTION);
		}
		return controAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectContainmentEList<Feedback>(Feedback.class, this, STPAsecPackage.SYSTEM__FEEDBACK);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlLoop> getControlLoop() {
		if (controlLoop == null) {
			controlLoop = new EObjectContainmentEList<ControlLoop>(ControlLoop.class, this,
					STPAsecPackage.SYSTEM__CONTROL_LOOP);
		}
		return controlLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tau.systemengineering.STPAsec.System> getSubSystem() {
		if (subSystem == null) {
			subSystem = new EObjectContainmentEList<tau.systemengineering.STPAsec.System>(
					tau.systemengineering.STPAsec.System.class, this, STPAsecPackage.SYSTEM__SUB_SYSTEM);
		}
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(String newGoal) {
		String oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformation() {
		if (information == null) {
			information = new EObjectContainmentEList<Information>(Information.class, this,
					STPAsecPackage.SYSTEM__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoFlow> getReceivesInfo() {
		if (receivesInfo == null) {
			receivesInfo = new EObjectWithInverseResolvingEList<InfoFlow>(InfoFlow.class, this,
					STPAsecPackage.SYSTEM__RECEIVES_INFO, STPAsecPackage.INFO_FLOW__INFO_RECEIVER);
		}
		return receivesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoFlow> getSendsInfo() {
		if (sendsInfo == null) {
			sendsInfo = new EObjectWithInverseResolvingEList<InfoFlow>(InfoFlow.class, this,
					STPAsecPackage.SYSTEM__SENDS_INFO, STPAsecPackage.INFO_FLOW__INFO_SENDER);
		}
		return sendsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeedbackFlow> getReceivesFeedback() {
		if (receivesFeedback == null) {
			receivesFeedback = new EObjectWithInverseResolvingEList<FeedbackFlow>(FeedbackFlow.class, this,
					STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK, STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER);
		}
		return receivesFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeedbackFlow> getSendsFeedback() {
		if (sendsFeedback == null) {
			sendsFeedback = new EObjectWithInverseResolvingEList<FeedbackFlow>(FeedbackFlow.class, this,
					STPAsecPackage.SYSTEM__SENDS_FEEDBACK, STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER);
		}
		return sendsFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmdFlow> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList<CmdFlow>(CmdFlow.class, this,
					STPAsecPackage.SYSTEM__CONTROLS, STPAsecPackage.CMD_FLOW__CONTROLED_BY);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmdFlow> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList<CmdFlow>(CmdFlow.class, this,
					STPAsecPackage.SYSTEM__PERFORMS, STPAsecPackage.CMD_FLOW__PERFORMED_BY);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerConstraints> getControllerConstraints() {
		if (controllerConstraints == null) {
			controllerConstraints = new EObjectContainmentEList<ControllerConstraints>(ControllerConstraints.class,
					this, STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS);
		}
		return controllerConstraints;
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
		case STPAsecPackage.SYSTEM__RECEIVES_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SENDS_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesFeedback()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SENDS_FEEDBACK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsFeedback()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__CONTROLS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControls()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__PERFORMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerforms()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.SYSTEM__CONTRO_ACTION:
			return ((InternalEList<?>) getControAction()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__FEEDBACK:
			return ((InternalEList<?>) getFeedback()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__CONTROL_LOOP:
			return ((InternalEList<?>) getControlLoop()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SUB_SYSTEM:
			return ((InternalEList<?>) getSubSystem()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__INFORMATION:
			return ((InternalEList<?>) getInformation()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__RECEIVES_INFO:
			return ((InternalEList<?>) getReceivesInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SENDS_INFO:
			return ((InternalEList<?>) getSendsInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK:
			return ((InternalEList<?>) getReceivesFeedback()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SENDS_FEEDBACK:
			return ((InternalEList<?>) getSendsFeedback()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__CONTROLS:
			return ((InternalEList<?>) getControls()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__PERFORMS:
			return ((InternalEList<?>) getPerforms()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS:
			return ((InternalEList<?>) getControllerConstraints()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.SYSTEM__CONTRO_ACTION:
			return getControAction();
		case STPAsecPackage.SYSTEM__FEEDBACK:
			return getFeedback();
		case STPAsecPackage.SYSTEM__CONTROL_LOOP:
			return getControlLoop();
		case STPAsecPackage.SYSTEM__SUB_SYSTEM:
			return getSubSystem();
		case STPAsecPackage.SYSTEM__ID:
			return getId();
		case STPAsecPackage.SYSTEM__NAME:
			return getName();
		case STPAsecPackage.SYSTEM__GOAL:
			return getGoal();
		case STPAsecPackage.SYSTEM__INFORMATION:
			return getInformation();
		case STPAsecPackage.SYSTEM__RECEIVES_INFO:
			return getReceivesInfo();
		case STPAsecPackage.SYSTEM__SENDS_INFO:
			return getSendsInfo();
		case STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK:
			return getReceivesFeedback();
		case STPAsecPackage.SYSTEM__SENDS_FEEDBACK:
			return getSendsFeedback();
		case STPAsecPackage.SYSTEM__CONTROLS:
			return getControls();
		case STPAsecPackage.SYSTEM__PERFORMS:
			return getPerforms();
		case STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS:
			return getControllerConstraints();
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
		case STPAsecPackage.SYSTEM__CONTRO_ACTION:
			getControAction().clear();
			getControAction().addAll((Collection<? extends ControlAction>) newValue);
			return;
		case STPAsecPackage.SYSTEM__FEEDBACK:
			getFeedback().clear();
			getFeedback().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.SYSTEM__CONTROL_LOOP:
			getControlLoop().clear();
			getControlLoop().addAll((Collection<? extends ControlLoop>) newValue);
			return;
		case STPAsecPackage.SYSTEM__SUB_SYSTEM:
			getSubSystem().clear();
			getSubSystem().addAll((Collection<? extends tau.systemengineering.STPAsec.System>) newValue);
			return;
		case STPAsecPackage.SYSTEM__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.SYSTEM__NAME:
			setName((String) newValue);
			return;
		case STPAsecPackage.SYSTEM__GOAL:
			setGoal((String) newValue);
			return;
		case STPAsecPackage.SYSTEM__INFORMATION:
			getInformation().clear();
			getInformation().addAll((Collection<? extends Information>) newValue);
			return;
		case STPAsecPackage.SYSTEM__RECEIVES_INFO:
			getReceivesInfo().clear();
			getReceivesInfo().addAll((Collection<? extends InfoFlow>) newValue);
			return;
		case STPAsecPackage.SYSTEM__SENDS_INFO:
			getSendsInfo().clear();
			getSendsInfo().addAll((Collection<? extends InfoFlow>) newValue);
			return;
		case STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK:
			getReceivesFeedback().clear();
			getReceivesFeedback().addAll((Collection<? extends FeedbackFlow>) newValue);
			return;
		case STPAsecPackage.SYSTEM__SENDS_FEEDBACK:
			getSendsFeedback().clear();
			getSendsFeedback().addAll((Collection<? extends FeedbackFlow>) newValue);
			return;
		case STPAsecPackage.SYSTEM__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends CmdFlow>) newValue);
			return;
		case STPAsecPackage.SYSTEM__PERFORMS:
			getPerforms().clear();
			getPerforms().addAll((Collection<? extends CmdFlow>) newValue);
			return;
		case STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS:
			getControllerConstraints().clear();
			getControllerConstraints().addAll((Collection<? extends ControllerConstraints>) newValue);
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
		case STPAsecPackage.SYSTEM__CONTRO_ACTION:
			getControAction().clear();
			return;
		case STPAsecPackage.SYSTEM__FEEDBACK:
			getFeedback().clear();
			return;
		case STPAsecPackage.SYSTEM__CONTROL_LOOP:
			getControlLoop().clear();
			return;
		case STPAsecPackage.SYSTEM__SUB_SYSTEM:
			getSubSystem().clear();
			return;
		case STPAsecPackage.SYSTEM__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM__GOAL:
			setGoal(GOAL_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM__INFORMATION:
			getInformation().clear();
			return;
		case STPAsecPackage.SYSTEM__RECEIVES_INFO:
			getReceivesInfo().clear();
			return;
		case STPAsecPackage.SYSTEM__SENDS_INFO:
			getSendsInfo().clear();
			return;
		case STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK:
			getReceivesFeedback().clear();
			return;
		case STPAsecPackage.SYSTEM__SENDS_FEEDBACK:
			getSendsFeedback().clear();
			return;
		case STPAsecPackage.SYSTEM__CONTROLS:
			getControls().clear();
			return;
		case STPAsecPackage.SYSTEM__PERFORMS:
			getPerforms().clear();
			return;
		case STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS:
			getControllerConstraints().clear();
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
		case STPAsecPackage.SYSTEM__CONTRO_ACTION:
			return controAction != null && !controAction.isEmpty();
		case STPAsecPackage.SYSTEM__FEEDBACK:
			return feedback != null && !feedback.isEmpty();
		case STPAsecPackage.SYSTEM__CONTROL_LOOP:
			return controlLoop != null && !controlLoop.isEmpty();
		case STPAsecPackage.SYSTEM__SUB_SYSTEM:
			return subSystem != null && !subSystem.isEmpty();
		case STPAsecPackage.SYSTEM__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case STPAsecPackage.SYSTEM__GOAL:
			return GOAL_EDEFAULT == null ? goal != null : !GOAL_EDEFAULT.equals(goal);
		case STPAsecPackage.SYSTEM__INFORMATION:
			return information != null && !information.isEmpty();
		case STPAsecPackage.SYSTEM__RECEIVES_INFO:
			return receivesInfo != null && !receivesInfo.isEmpty();
		case STPAsecPackage.SYSTEM__SENDS_INFO:
			return sendsInfo != null && !sendsInfo.isEmpty();
		case STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK:
			return receivesFeedback != null && !receivesFeedback.isEmpty();
		case STPAsecPackage.SYSTEM__SENDS_FEEDBACK:
			return sendsFeedback != null && !sendsFeedback.isEmpty();
		case STPAsecPackage.SYSTEM__CONTROLS:
			return controls != null && !controls.isEmpty();
		case STPAsecPackage.SYSTEM__PERFORMS:
			return performs != null && !performs.isEmpty();
		case STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS:
			return controllerConstraints != null && !controllerConstraints.isEmpty();
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", goal: ");
		result.append(goal);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
