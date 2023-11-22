/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.CmdFlow#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.CmdFlow#getPerformedBy <em>Performed By</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.CmdFlow#getControledBy <em>Controled By</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.CmdFlow#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getCmdFlow()
 * @model
 * @generated
 */
public interface CmdFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getCmdFlow_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.CmdFlow#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Performed By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By</em>' reference.
	 * @see #setPerformedBy(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getCmdFlow_PerformedBy()
	 * @see tau.systemengineering.STPAsec.System#getPerforms
	 * @model opposite="performs" required="true"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getPerformedBy();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.CmdFlow#getPerformedBy <em>Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed By</em>' reference.
	 * @see #getPerformedBy()
	 * @generated
	 */
	void setPerformedBy(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Controled By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controled By</em>' reference.
	 * @see #setControledBy(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getCmdFlow_ControledBy()
	 * @see tau.systemengineering.STPAsec.System#getControls
	 * @model opposite="controls" required="true"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getControledBy();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.CmdFlow#getControledBy <em>Controled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controled By</em>' reference.
	 * @see #getControledBy()
	 * @generated
	 */
	void setControledBy(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getCmdFlow_Cmd()
	 * @model required="true"
	 * @generated
	 */
	EList<ControlAction> getCmd();

} // CmdFlow
