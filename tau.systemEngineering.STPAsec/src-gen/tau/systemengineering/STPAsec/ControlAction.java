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
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getHazards <em>Hazards</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction()
 * @model
 * @generated
 */
public interface ControlAction extends DataFlow {

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getReceivedCommands <em>Received Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_Receiver()
	 * @see tau.systemengineering.STPAsec.Controller#getReceivedCommands
	 * @model opposite="receivedCommands"
	 * @generated
	 */
	Controller getReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Controller value);

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
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getSentCommands <em>Sent Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Controller)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_Sender()
	 * @see tau.systemengineering.STPAsec.Controller#getSentCommands
	 * @model opposite="sentCommands"
	 * @generated
	 */
	Controller getSender();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlAction#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Controller value);
} // ControlAction
