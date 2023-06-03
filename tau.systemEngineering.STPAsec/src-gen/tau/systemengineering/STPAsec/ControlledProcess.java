/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getSentFeedbacks <em>Sent Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlledProcess#getControlledProcessReceivedCommands <em>Controlled Process Received Commands</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess()
 * @model
 * @generated
 */
public interface ControlledProcess extends StructureElement {

	/**
	 * Returns the value of the '<em><b>Sent Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControlledProcessSender <em>Controlled Process Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_SentFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControlledProcessSender
	 * @model opposite="controlledProcessSender"
	 * @generated
	 */
	EList<Feedback> getSentFeedbacks();

	/**
	 * Returns the value of the '<em><b>Controlled Process Received Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getControlledProcessReceiver <em>Controlled Process Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Process Received Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlledProcess_ControlledProcessReceivedCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getControlledProcessReceiver
	 * @model opposite="controlledProcessReceiver"
	 * @generated
	 */
	EList<ControlAction> getControlledProcessReceivedCommands();
} // ControlledProcess
