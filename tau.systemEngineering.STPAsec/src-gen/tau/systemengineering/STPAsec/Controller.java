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
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getFeedbacks <em>Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getSentCommands <em>Sent Commands</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_ReceivedCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	EList<ControlAction> getReceivedCommands();

	/**
	 * Returns the value of the '<em><b>Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Feedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getController
	 * @model opposite="controller"
	 * @generated
	 */
	EList<Feedback> getFeedbacks();

	/**
	 * Returns the value of the '<em><b>Sent Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_SentCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getSender
	 * @model opposite="sender"
	 * @generated
	 */
	EList<ControlAction> getSentCommands();

} // Controller
