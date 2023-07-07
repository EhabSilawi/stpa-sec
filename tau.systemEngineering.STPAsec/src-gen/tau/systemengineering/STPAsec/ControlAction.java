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
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControllerSenders <em>Controller Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControllerReceivers <em>Controller Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getControledProccessReceivers <em>Controled Proccess Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getSubsystemSenders <em>Subsystem Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlAction#getSubsystemReceivers <em>Subsystem Receivers</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction()
 * @model
 * @generated
 */
public interface ControlAction extends ControlStructureElement {
	/**
	 * Returns the value of the '<em><b>Controller Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getSendsCommands <em>Sends Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControllerSenders()
	 * @see tau.systemengineering.STPAsec.Controller#getSendsCommands
	 * @model opposite="sendsCommands"
	 * @generated
	 */
	EList<Controller> getControllerSenders();

	/**
	 * Returns the value of the '<em><b>Controller Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Controller#getReceivesCommands <em>Receives Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControllerReceivers()
	 * @see tau.systemengineering.STPAsec.Controller#getReceivesCommands
	 * @model opposite="receivesCommands"
	 * @generated
	 */
	EList<Controller> getControllerReceivers();

	/**
	 * Returns the value of the '<em><b>Controled Proccess Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesCommands <em>Receives Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled Proccess Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_ControledProccessReceivers()
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getReceivesCommands
	 * @model opposite="receivesCommands"
	 * @generated
	 */
	EList<ControlledProcess> getControledProccessReceivers();

	/**
	 * Returns the value of the '<em><b>Subsystem Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_SubsystemSenders()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSendsCommands
	 * @model opposite="sendsCommands"
	 * @generated
	 */
	EList<ControlStructure> getSubsystemSenders();

	/**
	 * Returns the value of the '<em><b>Subsystem Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlStructure#getReceivesCommands <em>Receives Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlAction_SubsystemReceivers()
	 * @see tau.systemengineering.STPAsec.ControlStructure#getReceivesCommands
	 * @model opposite="receivesCommands"
	 * @generated
	 */
	EList<ControlStructure> getSubsystemReceivers();

} // ControlAction
