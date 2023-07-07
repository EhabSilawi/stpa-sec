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

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
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
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getController <em>Controller</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSubsystemModel <em>Subsystem Model</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getOtherinformation <em>Otherinformation</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSubsystemSenders <em>Subsystem Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSubsystemsReceivers <em>Subsystems Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSwndsInfor <em>Swnds Infor</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getSendsCommands <em>Sends Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl#getReceivesCommands <em>Receives Commands</em>}</li>
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
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * The cached value of the '{@link #getSubsystemModel() <em>Subsystem Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemModel()
	 * @generated
	 * @ordered
	 */
	protected EList<tau.systemengineering.STPAsec.System> subsystemModel;

	/**
	 * The cached value of the '{@link #getOtherinformation() <em>Otherinformation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherinformation()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInformation> otherinformation;

	/**
	 * The cached value of the '{@link #getSubsystemSenders() <em>Subsystem Senders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemSenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> subsystemSenders;

	/**
	 * The cached value of the '{@link #getSubsystemsReceivers() <em>Subsystems Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemsReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> subsystemsReceivers;

	/**
	 * The cached value of the '{@link #getSwndsInfor() <em>Swnds Infor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwndsInfor()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInformation> swndsInfor;

	/**
	 * The cached value of the '{@link #getReceivesInfo() <em>Receives Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInformation> receivesInfo;

	/**
	 * The cached value of the '{@link #getSendsCommands() <em>Sends Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> sendsCommands;

	/**
	 * The cached value of the '{@link #getReceivesCommands() <em>Receives Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> receivesCommands;

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
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tau.systemengineering.STPAsec.System> getSubsystemModel() {
		if (subsystemModel == null) {
			subsystemModel = new EObjectContainmentEList<tau.systemengineering.STPAsec.System>(
					tau.systemengineering.STPAsec.System.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_MODEL);
		}
		return subsystemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getOtherinformation() {
		if (otherinformation == null) {
			otherinformation = new EObjectContainmentEList<OtherInformation>(OtherInformation.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__OTHERINFORMATION);
		}
		return otherinformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getSubsystemSenders() {
		if (subsystemSenders == null) {
			subsystemSenders = new EObjectWithInverseResolvingEList.ManyInverse<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS, STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS);
		}
		return subsystemSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getSubsystemsReceivers() {
		if (subsystemsReceivers == null) {
			subsystemsReceivers = new EObjectWithInverseResolvingEList.ManyInverse<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS,
					STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS);
		}
		return subsystemsReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getSwndsInfor() {
		if (swndsInfor == null) {
			swndsInfor = new EObjectWithInverseResolvingEList.ManyInverse<OtherInformation>(OtherInformation.class,
					this, STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR,
					STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_SENDERS);
		}
		return swndsInfor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getReceivesInfo() {
		if (receivesInfo == null) {
			receivesInfo = new EObjectWithInverseResolvingEList<OtherInformation>(OtherInformation.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO,
					STPAsecPackage.OTHER_INFORMATION__SUBSYSTEM_RECEIVERS);
		}
		return receivesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getSendsCommands() {
		if (sendsCommands == null) {
			sendsCommands = new EObjectWithInverseResolvingEList.ManyInverse<ControlAction>(ControlAction.class, this,
					STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS, STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_SENDERS);
		}
		return sendsCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getReceivesCommands() {
		if (receivesCommands == null) {
			receivesCommands = new EObjectWithInverseResolvingEList.ManyInverse<ControlAction>(ControlAction.class,
					this, STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS,
					STPAsecPackage.CONTROL_ACTION__SUBSYSTEM_RECEIVERS);
		}
		return receivesCommands;
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
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubsystemSenders()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubsystemsReceivers()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSwndsInfor()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsCommands()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesCommands()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
			return ((InternalEList<?>) getControlledprocess()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
			return ((InternalEList<?>) getControlaction()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
			return ((InternalEList<?>) getFeedback()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			return ((InternalEList<?>) getController()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_MODEL:
			return ((InternalEList<?>) getSubsystemModel()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__OTHERINFORMATION:
			return ((InternalEList<?>) getOtherinformation()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS:
			return ((InternalEList<?>) getSubsystemSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS:
			return ((InternalEList<?>) getSubsystemsReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR:
			return ((InternalEList<?>) getSwndsInfor()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO:
			return ((InternalEList<?>) getReceivesInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			return ((InternalEList<?>) getSendsCommands()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS:
			return ((InternalEList<?>) getReceivesCommands()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			return getController();
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_MODEL:
			return getSubsystemModel();
		case STPAsecPackage.CONTROL_STRUCTURE__OTHERINFORMATION:
			return getOtherinformation();
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS:
			return getSubsystemSenders();
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS:
			return getSubsystemsReceivers();
		case STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR:
			return getSwndsInfor();
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO:
			return getReceivesInfo();
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			return getSendsCommands();
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS:
			return getReceivesCommands();
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
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			getController().clear();
			getController().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_MODEL:
			getSubsystemModel().clear();
			getSubsystemModel().addAll((Collection<? extends tau.systemengineering.STPAsec.System>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__OTHERINFORMATION:
			getOtherinformation().clear();
			getOtherinformation().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS:
			getSubsystemSenders().clear();
			getSubsystemSenders().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS:
			getSubsystemsReceivers().clear();
			getSubsystemsReceivers().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR:
			getSwndsInfor().clear();
			getSwndsInfor().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO:
			getReceivesInfo().clear();
			getReceivesInfo().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			getSendsCommands().clear();
			getSendsCommands().addAll((Collection<? extends ControlAction>) newValue);
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS:
			getReceivesCommands().clear();
			getReceivesCommands().addAll((Collection<? extends ControlAction>) newValue);
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
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			getController().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_MODEL:
			getSubsystemModel().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__OTHERINFORMATION:
			getOtherinformation().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS:
			getSubsystemSenders().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS:
			getSubsystemsReceivers().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR:
			getSwndsInfor().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO:
			getReceivesInfo().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			getSendsCommands().clear();
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS:
			getReceivesCommands().clear();
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
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLER:
			return controller != null && !controller.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_MODEL:
			return subsystemModel != null && !subsystemModel.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__OTHERINFORMATION:
			return otherinformation != null && !otherinformation.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS:
			return subsystemSenders != null && !subsystemSenders.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS:
			return subsystemsReceivers != null && !subsystemsReceivers.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__SWNDS_INFOR:
			return swndsInfor != null && !swndsInfor.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_INFO:
			return receivesInfo != null && !receivesInfo.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__SENDS_COMMANDS:
			return sendsCommands != null && !sendsCommands.isEmpty();
		case STPAsecPackage.CONTROL_STRUCTURE__RECEIVES_COMMANDS:
			return receivesCommands != null && !receivesCommands.isEmpty();
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
