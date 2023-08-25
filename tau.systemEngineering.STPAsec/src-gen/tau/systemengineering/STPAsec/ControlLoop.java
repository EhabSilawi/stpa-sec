/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlLoop#getCmdflow <em>Cmdflow</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlLoop#getFeedbackflow <em>Feedbackflow</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlLoop#getInfoflow <em>Infoflow</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlLoop()
 * @model
 * @generated
 */
public interface ControlLoop extends EObject {
	/**
	 * Returns the value of the '<em><b>Cmdflow</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.CmdFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdflow</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlLoop_Cmdflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmdFlow> getCmdflow();

	/**
	 * Returns the value of the '<em><b>Feedbackflow</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.FeedbackFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedbackflow</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlLoop_Feedbackflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackFlow> getFeedbackflow();

	/**
	 * Returns the value of the '<em><b>Infoflow</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.InfoFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infoflow</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlLoop_Infoflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfoFlow> getInfoflow();

} // ControlLoop
