/**
 */
package tau.systemengineering.STPAsec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControllerReceiver <em>Controller Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControlledProcessSender <em>Controlled Process Sender</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Feedback#getControllerSender <em>Controller Sender</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends DataFlow {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Controller Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getReceivedFeedbacks <em>Received Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Receiver</em>' reference.
	 * @see #setControllerReceiver(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControllerReceiver()
	 * @see tau.systemengineering.STPAsec.Controller#getReceivedFeedbacks
	 * @model opposite="receivedFeedbacks"
	 * @generated
	 */
	Controller getControllerReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getControllerReceiver <em>Controller Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Receiver</em>' reference.
	 * @see #getControllerReceiver()
	 * @generated
	 */
	void setControllerReceiver(Controller value);

	/**
	 * Returns the value of the '<em><b>Controlled Process Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getSentFeedbacks <em>Sent Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Process Sender</em>' reference.
	 * @see #setControlledProcessSender(ControlledProcess)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControlledProcessSender()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getSentFeedbacks
	 * @model opposite="sentFeedbacks"
	 * @generated
	 */
	ControlledProcess getControlledProcessSender();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getControlledProcessSender <em>Controlled Process Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled Process Sender</em>' reference.
	 * @see #getControlledProcessSender()
	 * @generated
	 */
	void setControlledProcessSender(ControlledProcess value);

	/**
	 * Returns the value of the '<em><b>Controller Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getSentFeedbacks <em>Sent Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Sender</em>' reference.
	 * @see #setControllerSender(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getFeedback_ControllerSender()
	 * @see tau.systemengineering.STPAsec.Controller#getSentFeedbacks
	 * @model opposite="sentFeedbacks"
	 * @generated
	 */
	Controller getControllerSender();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Feedback#getControllerSender <em>Controller Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Sender</em>' reference.
	 * @see #getControllerSender()
	 * @generated
	 */
	void setControllerSender(Controller value);

} // Feedback
