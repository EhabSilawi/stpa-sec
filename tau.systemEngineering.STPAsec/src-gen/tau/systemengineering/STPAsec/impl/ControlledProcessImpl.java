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
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getSendsInfo <em>Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getReceivesCommands <em>Receives Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getReceivesFeedbacks <em>Receives Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledProcessImpl extends ControlStructureElementImpl implements ControlledProcess {
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
	 * The cached value of the '{@link #getReceivesCommands() <em>Receives Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> receivesCommands;

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
	 * The cached value of the '{@link #getSendsFeedbacks() <em>Sends Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> sendsFeedbacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlledProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROLLED_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getSendsInfo() {
		if (sendsInfo == null) {
			sendsInfo = new EObjectWithInverseResolvingEList.ManyInverse<OtherInformation>(OtherInformation.class, this,
					STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO,
					STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS);
		}
		return sendsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getSendsFeedbacks() {
		if (sendsFeedbacks == null) {
			sendsFeedbacks = new EObjectWithInverseResolvingEList.ManyInverse<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS,
					STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_SENDERS);
		}
		return sendsFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInformation> getReceivesInfo() {
		if (receivesInfo == null) {
			receivesInfo = new EObjectWithInverseResolvingEList.ManyInverse<OtherInformation>(OtherInformation.class,
					this, STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO,
					STPAsecPackage.OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS);
		}
		return receivesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getReceivesCommands() {
		if (receivesCommands == null) {
			receivesCommands = new EObjectWithInverseResolvingEList.ManyInverse<ControlAction>(ControlAction.class,
					this, STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS,
					STPAsecPackage.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS);
		}
		return receivesCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getReceivesFeedbacks() {
		if (receivesFeedbacks == null) {
			receivesFeedbacks = new EObjectWithInverseResolvingEList.ManyInverse<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS,
					STPAsecPackage.FEEDBACK__CONTROLED_PROCESS_RECEIVERS);
		}
		return receivesFeedbacks;
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesInfo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesCommands()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesFeedbacks()).basicAdd(otherEnd,
					msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSendsFeedbacks()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO:
			return ((InternalEList<?>) getSendsInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO:
			return ((InternalEList<?>) getReceivesInfo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS:
			return ((InternalEList<?>) getReceivesCommands()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS:
			return ((InternalEList<?>) getReceivesFeedbacks()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			return ((InternalEList<?>) getSendsFeedbacks()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO:
			return getSendsInfo();
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO:
			return getReceivesInfo();
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS:
			return getReceivesCommands();
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS:
			return getReceivesFeedbacks();
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			return getSendsFeedbacks();
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO:
			getSendsInfo().clear();
			getSendsInfo().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO:
			getReceivesInfo().clear();
			getReceivesInfo().addAll((Collection<? extends OtherInformation>) newValue);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS:
			getReceivesCommands().clear();
			getReceivesCommands().addAll((Collection<? extends ControlAction>) newValue);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS:
			getReceivesFeedbacks().clear();
			getReceivesFeedbacks().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			getSendsFeedbacks().clear();
			getSendsFeedbacks().addAll((Collection<? extends Feedback>) newValue);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO:
			getSendsInfo().clear();
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO:
			getReceivesInfo().clear();
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS:
			getReceivesCommands().clear();
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS:
			getReceivesFeedbacks().clear();
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			getSendsFeedbacks().clear();
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_INFO:
			return sendsInfo != null && !sendsInfo.isEmpty();
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_INFO:
			return receivesInfo != null && !receivesInfo.isEmpty();
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_COMMANDS:
			return receivesCommands != null && !receivesCommands.isEmpty();
		case STPAsecPackage.CONTROLLED_PROCESS__RECEIVES_FEEDBACKS:
			return receivesFeedbacks != null && !receivesFeedbacks.isEmpty();
		case STPAsecPackage.CONTROLLED_PROCESS__SENDS_FEEDBACKS:
			return sendsFeedbacks != null && !sendsFeedbacks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlledProcessImpl
