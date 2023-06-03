/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getReceivedCommands <em>Received Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getReceivedFeedbacks <em>Received Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSentCommands <em>Sent Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSentFeedbacks <em>Sent Feedbacks</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends StructureElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Received Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getControllerReceiver <em>Controller Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_ReceivedCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerReceiver
	 * @model opposite="controllerReceiver"
	 * @generated
	 */
	EList<ControlAction> getReceivedCommands();

	/**
	 * Returns the value of the '<em><b>Received Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControllerReceiver <em>Controller Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_ReceivedFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerReceiver
	 * @model opposite="controllerReceiver" required="true"
	 * @generated
	 */
	EList<Feedback> getReceivedFeedbacks();

	/**
	 * Returns the value of the '<em><b>Sent Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getContollerSender <em>Contoller Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SentCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getContollerSender
	 * @model opposite="contollerSender"
	 * @generated
	 */
	EList<ControlAction> getSentCommands();

	/**
	 * Returns the value of the '<em><b>Sub Systems</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Systems</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SubSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<tau.systemengineering.STPAsec.System> getSubSystems();

	/**
	 * Returns the value of the '<em><b>Sent Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControllerSender <em>Controller Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SentFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerSender
	 * @model opposite="controllerSender" required="true"
	 * @generated
	 */
	EList<Feedback> getSentFeedbacks();

} // Controller
