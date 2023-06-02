/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Hazard#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Hazard#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Hazard#getRelatedLosses <em>Related Losses</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Hazard#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getHazard_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Hazard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getHazard_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Hazard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Related Losses</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.LossScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Losses</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getHazard_RelatedLosses()
	 * @model
	 * @generated
	 */
	EList<LossScenario> getRelatedLosses();

	/**
	 * Returns the value of the '<em><b>Unsafe Control Actions</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsafe Control Actions</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getHazard_UnsafeControlActions()
	 * @see tau.systemengineering.STPAsec.ControlAction#getHazards
	 * @model opposite="hazards"
	 * @generated
	 */
	EList<ControlAction> getUnsafeControlActions();

} // Hazard
