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
import tau.systemengineering.STPAsec.ControlStructure;
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
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControllerSenders <em>Controller Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControllerReceivers <em>Controller Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControledProcessReceivers <em>Controled Process Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getControledProcessSenders <em>Controled Process Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackImpl#getReceiversFeedbacks <em>Receivers Feedbacks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends ControlStructureElementImpl implements Feedback {
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
	 * The cached value of the '{@link #getControledProcessReceivers() <em>Controled Process Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControledProcessReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledProcess> controledProcessReceivers;
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
	 * The cached value of the '{@link #getSendsFeedbacks() <em>Sends Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> sendsFeedbacks;
	/**
	 * The cached value of the '{@link #getReceiversFeedbacks() <em>Receivers Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiversFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> receiversFeedbacks;

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
	public EList<Controller> getControllerSenders() {
		if (controllerSenders == null) {
			controllerSenders = new EObjectWithInverseResolvingEList.ManyInverse<Controller>(Controller.class, this,
					STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS, STPAsecPackage.CONTROLLER__SENDS_FEEDBACKS);
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
					STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS, STPAsecPackage.CONTROLLER__RECEIVES_FEEDBACKS);
		}
		return controllerReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledProcess> getControledProcessReceivers() {
		if (controledProcessReceivers == null) {
			controledProcessReceivers = new EObjectWithInverseResolvingEList.ManyInverse<ControlledProcess>(
					ControlledProcess.class, this, STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS,
					STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS);
		}
		return controledProcessReceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledProcess> getControledProcessSenders() {
		if (controledProcessSenders == null) {
			controledProcessSenders = new EObjectWithInverseResolvingEList.ManyInverse<ControlledProcess>(
					ControlledProcess.class, this, STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS,
					STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS);
		}
		return controledProcessSenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getSendsFeedbacks() {
		if (sendsFeedbacks == null) {
			sendsFeedbacks = new EObjectWithInverseResolvingEList.ManyInverse<ControlStructure>(ControlStructure.class,
					this, STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS,
					STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEM_SENDERS);
		}
		return sendsFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getReceiversFeedbacks() {
		if (receiversFeedbacks == null) {
			receiversFeedbacks = new EObjectWithInverseResolvingEList.ManyInverse<ControlStructure>(
					ControlStructure.class, this, STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS,
					STPAsecPackage.CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS);
		}
		return receiversFeedbacks;
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerSenders()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllerReceivers()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControledProcessReceivers())
					.basicAdd(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControledProcessSenders()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsFeedbacks()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceiversFeedbacks()).basicAdd(otherEnd,
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS:
			return ((InternalEList<?>) getControllerSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS:
			return ((InternalEList<?>) getControllerReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS:
			return ((InternalEList<?>) getControledProcessReceivers()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS:
			return ((InternalEList<?>) getControledProcessSenders()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS:
			return ((InternalEList<?>) getSendsFeedbacks()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS:
			return ((InternalEList<?>) getReceiversFeedbacks()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS:
			return getControllerSenders();
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS:
			return getControllerReceivers();
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS:
			return getControledProcessReceivers();
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS:
			return getControledProcessSenders();
		case STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS:
			return getSendsFeedbacks();
		case STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS:
			return getReceiversFeedbacks();
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS:
			getControllerSenders().clear();
			getControllerSenders().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS:
			getControllerReceivers().clear();
			getControllerReceivers().addAll((Collection<? extends Controller>) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS:
			getControledProcessReceivers().clear();
			getControledProcessReceivers().addAll((Collection<? extends ControlledProcess>) newValue);
			return;
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS:
			getControledProcessSenders().clear();
			getControledProcessSenders().addAll((Collection<? extends ControlledProcess>) newValue);
			return;
		case STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS:
			getSendsFeedbacks().clear();
			getSendsFeedbacks().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		case STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS:
			getReceiversFeedbacks().clear();
			getReceiversFeedbacks().addAll((Collection<? extends ControlStructure>) newValue);
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS:
			getControllerSenders().clear();
			return;
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS:
			getControllerReceivers().clear();
			return;
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS:
			getControledProcessReceivers().clear();
			return;
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS:
			getControledProcessSenders().clear();
			return;
		case STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS:
			getSendsFeedbacks().clear();
			return;
		case STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS:
			getReceiversFeedbacks().clear();
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
		case STPAsecPackage.FEEDBACK__CONTROLLER_SENDERS:
			return controllerSenders != null && !controllerSenders.isEmpty();
		case STPAsecPackage.FEEDBACK__CONTROLLER_RECEIVERS:
			return controllerReceivers != null && !controllerReceivers.isEmpty();
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS:
			return controledProcessReceivers != null && !controledProcessReceivers.isEmpty();
		case STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS:
			return controledProcessSenders != null && !controledProcessSenders.isEmpty();
		case STPAsecPackage.FEEDBACK__SENDS_FEEDBACKS:
			return sendsFeedbacks != null && !sendsFeedbacks.isEmpty();
		case STPAsecPackage.FEEDBACK__RECEIVERS_FEEDBACKS:
			return receiversFeedbacks != null && !receiversFeedbacks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeedbackImpl
