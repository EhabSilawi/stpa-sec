/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.MissionGoal;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SecurityRecommendation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemImpl#getPotentialHazards <em>Potential Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ControllerImpl implements tau.systemengineering.STPAsec.System {
	/**
	 * The cached value of the '{@link #getRecommends() <em>Recommends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommends()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRecommendation> recommends;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionGoal> goals;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<LossScenario> scenario;

	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> consistsOf;

	/**
	 * The cached value of the '{@link #getPotentialHazards() <em>Potential Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> potentialHazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRecommendation> getRecommends() {
		if (recommends == null) {
			recommends = new EObjectContainmentEList<SecurityRecommendation>(SecurityRecommendation.class, this,
					STPAsecPackage.SYSTEM__RECOMMENDS);
		}
		return recommends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MissionGoal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<MissionGoal>(MissionGoal.class, this, STPAsecPackage.SYSTEM__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LossScenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<LossScenario>(LossScenario.class, this,
					STPAsecPackage.SYSTEM__SCENARIO);
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlStructure> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectContainmentEList<ControlStructure>(ControlStructure.class, this,
					STPAsecPackage.SYSTEM__CONSISTS_OF);
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getPotentialHazards() {
		if (potentialHazards == null) {
			potentialHazards = new EObjectContainmentEList<Hazard>(Hazard.class, this,
					STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS);
		}
		return potentialHazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.SYSTEM__RECOMMENDS:
			return ((InternalEList<?>) getRecommends()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__GOALS:
			return ((InternalEList<?>) getGoals()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			return ((InternalEList<?>) getConsistsOf()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS:
			return ((InternalEList<?>) getPotentialHazards()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.SYSTEM__RECOMMENDS:
			return getRecommends();
		case STPAsecPackage.SYSTEM__GOALS:
			return getGoals();
		case STPAsecPackage.SYSTEM__SCENARIO:
			return getScenario();
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			return getConsistsOf();
		case STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS:
			return getPotentialHazards();
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
		case STPAsecPackage.SYSTEM__RECOMMENDS:
			getRecommends().clear();
			getRecommends().addAll((Collection<? extends SecurityRecommendation>) newValue);
			return;
		case STPAsecPackage.SYSTEM__GOALS:
			getGoals().clear();
			getGoals().addAll((Collection<? extends MissionGoal>) newValue);
			return;
		case STPAsecPackage.SYSTEM__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends LossScenario>) newValue);
			return;
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			getConsistsOf().clear();
			getConsistsOf().addAll((Collection<? extends ControlStructure>) newValue);
			return;
		case STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS:
			getPotentialHazards().clear();
			getPotentialHazards().addAll((Collection<? extends Hazard>) newValue);
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
		case STPAsecPackage.SYSTEM__RECOMMENDS:
			getRecommends().clear();
			return;
		case STPAsecPackage.SYSTEM__GOALS:
			getGoals().clear();
			return;
		case STPAsecPackage.SYSTEM__SCENARIO:
			getScenario().clear();
			return;
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			getConsistsOf().clear();
			return;
		case STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS:
			getPotentialHazards().clear();
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
		case STPAsecPackage.SYSTEM__RECOMMENDS:
			return recommends != null && !recommends.isEmpty();
		case STPAsecPackage.SYSTEM__GOALS:
			return goals != null && !goals.isEmpty();
		case STPAsecPackage.SYSTEM__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
			return consistsOf != null && !consistsOf.isEmpty();
		case STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS:
			return potentialHazards != null && !potentialHazards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
