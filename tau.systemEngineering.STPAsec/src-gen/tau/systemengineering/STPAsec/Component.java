/**
 */
package tau.systemengineering.STPAsec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Component#getCommand <em>Command</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Component#getDataFlow <em>Data Flow</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends StructureElement {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getComponent_Command()
	 * @model derived="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Component#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Data Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow</em>' reference.
	 * @see #setDataFlow(Feedback)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getComponent_DataFlow()
	 * @model derived="true"
	 * @generated
	 */
	Feedback getDataFlow();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Component#getDataFlow <em>Data Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Flow</em>' reference.
	 * @see #getDataFlow()
	 * @generated
	 */
	void setDataFlow(Feedback value);

} // Component
