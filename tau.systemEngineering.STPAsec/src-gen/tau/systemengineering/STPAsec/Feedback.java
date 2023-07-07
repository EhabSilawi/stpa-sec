/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControllerSenders <em>Controller Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControllerReceivers <em>Controller Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControledProcessReceivers <em>Controled Process Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControledProcessSenders <em>Controled Process Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getReceiversFeedbacks <em>Receivers Feedbacks</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Controller Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControllerSenders()
	 * @see tau.systemengineering.STPAsec.Controller#getSendsFeedbacks
	 * @model opposite="sendsFeedbacks"
	 * @generated
	 */
	EList<Controller> getControllerSenders();

	/**
	 * Returns the value of the '<em><b>Controller Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getReceivesFeedbacks <em>Receives Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControllerReceivers()
	 * @see tau.systemengineering.STPAsec.Controller#getReceivesFeedbacks
	 * @model opposite="receivesFeedbacks"
	 * @generated
	 */
	EList<Controller> getControllerReceivers();

	/**
	 * Returns the value of the '<em><b>Controled Process Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesFeedbacks <em>Receives Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Process Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControledProcessReceivers()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getReceivesFeedbacks
	 * @model opposite="receivesFeedbacks"
	 * @generated
	 */
	EList<ControlledProcess> getControledProcessReceivers();

	/**
	 * Returns the value of the '<em><b>Controled Process Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Process Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControledProcessSenders()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks
	 * @model opposite="sendsFeedbacks"
	 * @generated
	 */
	EList<ControlledProcess> getControledProcessSenders();

	/**
	 * Returns the value of the '<em><b>Sends Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemSenders <em>Subsystem Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_SendsFeedbacks()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSubsystemSenders
	 * @model opposite="subsystemSenders"
	 * @generated
	 */
	EList<ControlStructure> getSendsFeedbacks();

	/**
	 * Returns the value of the '<em><b>Receivers Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemsReceivers <em>Subsystems Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ReceiversFeedbacks()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSubsystemsReceivers
	 * @model opposite="subsystemsReceivers"
	 * @generated
	 */
	EList<ControlStructure> getReceiversFeedbacks();

} // Feedback
