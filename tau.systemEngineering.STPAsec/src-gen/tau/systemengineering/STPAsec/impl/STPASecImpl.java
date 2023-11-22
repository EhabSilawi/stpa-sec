/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tau.systemengineering.STPAsec.ControllerConstraints;
import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.Loss;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.Scenario;
import tau.systemengineering.STPAsec.SystemLevelConstraint;
import tau.systemengineering.STPAsec.SystemLevelHazard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STPA Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getLoss <em>Loss</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getSystemLevelHazard <em>System Level Hazard</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getSystemLevelConstraint <em>System Level Constraint</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getInsecureControlAction <em>Insecure Control Action</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.STPASecImpl#getControllerConstraints <em>Controller Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STPASecImpl extends MinimalEObjectImpl.Container implements STPASec {

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<tau.systemengineering.STPAsec.System> system;
	/**
	 * The cached value of the '{@link #getLoss() <em>Loss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss()
	 * @generated
	 * @ordered
	 */
	protected EList<Loss> loss;
	/**
	 * The cached value of the '{@link #getSystemLevelHazard() <em>System Level Hazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLevelHazard()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelHazard> systemLevelHazard;
	/**
	 * The cached value of the '{@link #getSystemLevelConstraint() <em>System Level Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLevelConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelConstraint> systemLevelConstraint;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;

	/**
	 * The cached value of the '{@link #getInsecureControlAction() <em>Insecure Control Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsecureControlAction()
	 * @generated
	 * @ordered
	 */
	protected EList<InsecureControlAction> insecureControlAction;

	/**
	 * The cached value of the '{@link #getControllerConstraints() <em>Controller Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerConstraints> controllerConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STPASecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.STPA_SEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tau.systemengineering.STPAsec.System> getSystem() {
		if (system == null) {
			system = new EObjectContainmentEList<tau.systemengineering.STPAsec.System>(
					tau.systemengineering.STPAsec.System.class, this, STPAsecPackage.STPA_SEC__SYSTEM);
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loss> getLoss() {
		if (loss == null) {
			loss = new EObjectContainmentEList<Loss>(Loss.class, this, STPAsecPackage.STPA_SEC__LOSS);
		}
		return loss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemLevelHazard> getSystemLevelHazard() {
		if (systemLevelHazard == null) {
			systemLevelHazard = new EObjectContainmentEList<SystemLevelHazard>(SystemLevelHazard.class, this,
					STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD);
		}
		return systemLevelHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemLevelConstraint> getSystemLevelConstraint() {
		if (systemLevelConstraint == null) {
			systemLevelConstraint = new EObjectContainmentEList<SystemLevelConstraint>(SystemLevelConstraint.class,
					this, STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT);
		}
		return systemLevelConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this, STPAsecPackage.STPA_SEC__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsecureControlAction> getInsecureControlAction() {
		if (insecureControlAction == null) {
			insecureControlAction = new EObjectContainmentEList<InsecureControlAction>(InsecureControlAction.class,
					this, STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION);
		}
		return insecureControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerConstraints> getControllerConstraints() {
		if (controllerConstraints == null) {
			controllerConstraints = new EObjectContainmentEList<ControllerConstraints>(ControllerConstraints.class,
					this, STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS);
		}
		return controllerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.STPA_SEC__SYSTEM:
			return ((InternalEList<?>) getSystem()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.STPA_SEC__LOSS:
			return ((InternalEList<?>) getLoss()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD:
			return ((InternalEList<?>) getSystemLevelHazard()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT:
			return ((InternalEList<?>) getSystemLevelConstraint()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.STPA_SEC__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION:
			return ((InternalEList<?>) getInsecureControlAction()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS:
			return ((InternalEList<?>) getControllerConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.STPA_SEC__SYSTEM:
			return getSystem();
		case STPAsecPackage.STPA_SEC__LOSS:
			return getLoss();
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD:
			return getSystemLevelHazard();
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT:
			return getSystemLevelConstraint();
		case STPAsecPackage.STPA_SEC__SCENARIO:
			return getScenario();
		case STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION:
			return getInsecureControlAction();
		case STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS:
			return getControllerConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.STPA_SEC__SYSTEM:
			getSystem().clear();
			getSystem().addAll((Collection<? extends tau.systemengineering.STPAsec.System>) newValue);
			return;
		case STPAsecPackage.STPA_SEC__LOSS:
			getLoss().clear();
			getLoss().addAll((Collection<? extends Loss>) newValue);
			return;
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD:
			getSystemLevelHazard().clear();
			getSystemLevelHazard().addAll((Collection<? extends SystemLevelHazard>) newValue);
			return;
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT:
			getSystemLevelConstraint().clear();
			getSystemLevelConstraint().addAll((Collection<? extends SystemLevelConstraint>) newValue);
			return;
		case STPAsecPackage.STPA_SEC__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
			return;
		case STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION:
			getInsecureControlAction().clear();
			getInsecureControlAction().addAll((Collection<? extends InsecureControlAction>) newValue);
			return;
		case STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS:
			getControllerConstraints().clear();
			getControllerConstraints().addAll((Collection<? extends ControllerConstraints>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STPAsecPackage.STPA_SEC__SYSTEM:
			getSystem().clear();
			return;
		case STPAsecPackage.STPA_SEC__LOSS:
			getLoss().clear();
			return;
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD:
			getSystemLevelHazard().clear();
			return;
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT:
			getSystemLevelConstraint().clear();
			return;
		case STPAsecPackage.STPA_SEC__SCENARIO:
			getScenario().clear();
			return;
		case STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION:
			getInsecureControlAction().clear();
			return;
		case STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS:
			getControllerConstraints().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STPAsecPackage.STPA_SEC__SYSTEM:
			return system != null && !system.isEmpty();
		case STPAsecPackage.STPA_SEC__LOSS:
			return loss != null && !loss.isEmpty();
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD:
			return systemLevelHazard != null && !systemLevelHazard.isEmpty();
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT:
			return systemLevelConstraint != null && !systemLevelConstraint.isEmpty();
		case STPAsecPackage.STPA_SEC__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION:
			return insecureControlAction != null && !insecureControlAction.isEmpty();
		case STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS:
			return controllerConstraints != null && !controllerConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //STPASecImpl
