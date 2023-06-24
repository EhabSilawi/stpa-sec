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
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getSentFeedbacks <em>Sent Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl#getControlledProcessReceivedCommands <em>Controlled Process Received Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledProcessImpl extends ControlStructureImpl implements ControlledProcess {
	/**
	 * The cached value of the '{@link #getSentFeedbacks() <em>Sent Feedbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentFeedbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> sentFeedbacks;
	/**
	 * The cached value of the '{@link #getControlledProcessReceivedCommands() <em>Controlled Process Received Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledProcessReceivedCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> controlledProcessReceivedCommands;

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
	public EList<Feedback> getSentFeedbacks() {
		if (sentFeedbacks == null) {
			sentFeedbacks = new EObjectWithInverseResolvingEList<Feedback>(Feedback.class, this,
					STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS,
					STPAsecPackage.FEEDBACK__CONTROLLED_PROCESS_SENDER);
		}
		return sentFeedbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAction> getControlledProcessReceivedCommands() {
		if (controlledProcessReceivedCommands == null) {
			controlledProcessReceivedCommands = new EObjectWithInverseResolvingEList<ControlAction>(ControlAction.class,
					this, STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS,
					STPAsecPackage.CONTROL_ACTION__CONTROLLED_PROCESS_RECEIVER);
		}
		return controlledProcessReceivedCommands;
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSentFeedbacks()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControlledProcessReceivedCommands())
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS:
			return ((InternalEList<?>) getSentFeedbacks()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS:
			return ((InternalEList<?>) getControlledProcessReceivedCommands()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS:
			return getSentFeedbacks();
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS:
			return getControlledProcessReceivedCommands();
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS:
			getSentFeedbacks().clear();
			getSentFeedbacks().addAll((Collection<? extends Feedback>) newValue);
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS:
			getControlledProcessReceivedCommands().clear();
			getControlledProcessReceivedCommands().addAll((Collection<? extends ControlAction>) newValue);
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS:
			getSentFeedbacks().clear();
			return;
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS:
			getControlledProcessReceivedCommands().clear();
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
		case STPAsecPackage.CONTROLLED_PROCESS__SENT_FEEDBACKS:
			return sentFeedbacks != null && !sentFeedbacks.isEmpty();
		case STPAsecPackage.CONTROLLED_PROCESS__CONTROLLED_PROCESS_RECEIVED_COMMANDS:
			return controlledProcessReceivedCommands != null && !controlledProcessReceivedCommands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlledProcessImpl
