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
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getSendsCommands <em>Sends Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getSendsInfo <em>Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getReceivesFeedbacks <em>Receives Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerImpl#getReceivesCommands <em>Receives Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ControlStructureElementImpl implements Controller {
	/**
	 * The cached value of the '{@link #getSendsFeedbacks() <em>Sends Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> sendsFeedbacks;

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
	 * The cached value of the '{@link #getSendsInfo() <em>Sends Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInformation> sendsInfo;

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
	 * The cached value of the '{@link #getReceivesFeedbacks() <em>Receives Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> receivesFeedbacks;

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
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getSendsFeedbacks() {
		if (sendsFeedbacks == null) {
			sendsFeedbacks = new EObjectWithInverseResolvingEList.ManyInverse<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS, STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS);
		}
		return sendsFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getSendsCommands() {
		if (sendsCommands == null) {
			sendsCommands = new EObjectWithInverseResolvingEList.ManyInverse<ControlAction>(ControlAction.class, this,
					STPAsecPackage.CONTROLLER__SENDS_COMMANDS, STPAsecPackage.CONTROL_ACTION__CONTROLLER_SENDERS);
		}
		return sendsCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getSendsInfo() {
		if (sendsInfo == null) {
			sendsInfo = new EObjectWithInverseResolvingEList.ManyInverse<OtherInformation>(OtherInformation.class, this,
					STPAsecPackage.CONTROLLER__SENDS_INFO, STPAsecPackage.OTHER_INFORMATION__CONTROLLER_SENDERS);
		}
		return sendsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getReceivesInfo() {
		if (receivesInfo == null) {
			receivesInfo = new EObjectWithInverseResolvingEList.ManyInverse<OtherInformation>(OtherInformation.class,
					this, STPAsecPackage.CONTROLLER__RECEIVES_INFO,
					STPAsecPackage.OTHER_INFORMATION__CONTROLLER_RECEIVERS);
		}
		return receivesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getReceivesFeedbacks() {
		if (receivesFeedbacks == null) {
			receivesFeedbacks = new EObjectWithInverseResolvingEList.ManyInverse<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS, STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS);
		}
		return receivesFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getReceivesCommands() {
		if (receivesCommands == null) {
			receivesCommands = new EObjectWithInverseResolvingEList.ManyInverse<ControlAction>(ControlAction.class,
					this, STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS,
					STPAsecPackage.CONTROL_ACTION__CONTROLLER_RECEIVERS);
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
		case STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsFeedbacks()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__SENDS_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsCommands()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__SENDS_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__RECEIVES_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesFeedbacks()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesCommands()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS:
			return ((InternalEList<?>) getSendsFeedbacks()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__SENDS_COMMANDS:
			return ((InternalEList<?>) getSendsCommands()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__SENDS_INFO:
			return ((InternalEList<?>) getSendsInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__RECEIVES_INFO:
			return ((InternalEList<?>) getReceivesInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS:
			return ((InternalEList<?>) getReceivesFeedbacks()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS:
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
		case STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS:
			return getSendsFeedbacks();
		case STPAsecPackage.CONTROLLER__SENDS_COMMANDS:
			return getSendsCommands();
		case STPAsecPackage.CONTROLLER__SENDS_INFO:
			return getSendsInfo();
		case STPAsecPackage.CONTROLLER__RECEIVES_INFO:
			return getReceivesInfo();
		case STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS:
			return getReceivesFeedbacks();
		case STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS:
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
		case STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS:
			getSendsFeedbacks().clear();
			getSendsFeedbacks().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROLLER__SENDS_COMMANDS:
			getSendsCommands().clear();
			getSendsCommands().addAll((Collection<? extends ControlAction>) newValue);
			return;
		case STPAsecPackage.CONTROLLER__SENDS_INFO:
			getSendsInfo().clear();
			getSendsInfo().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROLLER__RECEIVES_INFO:
			getReceivesInfo().clear();
			getReceivesInfo().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS:
			getReceivesFeedbacks().clear();
			getReceivesFeedbacks().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS:
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
		case STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS:
			getSendsFeedbacks().clear();
			return;
		case STPAsecPackage.CONTROLLER__SENDS_COMMANDS:
			getSendsCommands().clear();
			return;
		case STPAsecPackage.CONTROLLER__SENDS_INFO:
			getSendsInfo().clear();
			return;
		case STPAsecPackage.CONTROLLER__RECEIVES_INFO:
			getReceivesInfo().clear();
			return;
		case STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS:
			getReceivesFeedbacks().clear();
			return;
		case STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS:
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
		case STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS:
			return sendsFeedbacks != null && !sendsFeedbacks.isEmpty();
		case STPAsecPackage.CONTROLLER__SENDS_COMMANDS:
			return sendsCommands != null && !sendsCommands.isEmpty();
		case STPAsecPackage.CONTROLLER__SENDS_INFO:
			return sendsInfo != null && !sendsInfo.isEmpty();
		case STPAsecPackage.CONTROLLER__RECEIVES_INFO:
			return receivesInfo != null && !receivesInfo.isEmpty();
		case STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS:
			return receivesFeedbacks != null && !receivesFeedbacks.isEmpty();
		case STPAsecPackage.CONTROLLER__RECEIVES_COMMANDS:
			return receivesCommands != null && !receivesCommands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
