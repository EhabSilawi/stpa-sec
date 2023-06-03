/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControllerReceiver <em>Controller Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getHazards <em>Hazards</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getContollerSender <em>Contoller Sender</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControlledProcessReceiver <em>Controlled Process Receiver</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction()
 * @model
 * @generated
 */
public interface ControlAction extends DataFlow {

	/**
	 * Returns the value of the '<em><b>Controller Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getReceivedCommands <em>Received Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Receiver</em>' reference.
	 * @see #setControllerReceiver(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControllerReceiver()
	 * @see tau.systemengineering.STPAsec.Controller#getReceivedCommands
	 * @model opposite="receivedCommands"
	 * @generated
	 */
	Controller getControllerReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getControllerReceiver <em>Controller Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Receiver</em>' reference.
	 * @see #getControllerReceiver()
	 * @generated
	 */
	void setControllerReceiver(Controller value);

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Hazard}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Hazard#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_Hazards()
	 * @see tau.systemengineering.STPAsec.Hazard#getUnsafeControlActions
	 * @model opposite="unsafeControlActions"
	 * @generated
	 */
	EList<Hazard> getHazards();

	/**
	 * Returns the value of the '<em><b>Contoller Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getSentCommands <em>Sent Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contoller Sender</em>' reference.
	 * @see #setContollerSender(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ContollerSender()
	 * @see tau.systemengineering.STPAsec.Controller#getSentCommands
	 * @model opposite="sentCommands"
	 * @generated
	 */
	Controller getContollerSender();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getContollerSender <em>Contoller Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contoller Sender</em>' reference.
	 * @see #getContollerSender()
	 * @generated
	 */
	void setContollerSender(Controller value);

	/**
	 * Returns the value of the '<em><b>Controlled Process Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getControlledProcessReceivedCommands <em>Controlled Process Received Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Process Receiver</em>' reference.
	 * @see #setControlledProcessReceiver(ControlledProcess)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControlledProcessReceiver()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getControlledProcessReceivedCommands
	 * @model opposite="controlledProcessReceivedCommands"
	 * @generated
	 */
	ControlledProcess getControlledProcessReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getControlledProcessReceiver <em>Controlled Process Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled Process Receiver</em>' reference.
	 * @see #getControlledProcessReceiver()
	 * @generated
	 */
	void setControlledProcessReceiver(ControlledProcess value);
} // ControlAction
