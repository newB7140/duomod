const spiritduo = extendContent(UnitType, "spiritduo", {});

spiritduo.create(prov(() => {
    const s = new JavaAdapter(RepairAI, {
        
        updateMovement(){
            if(target instanceof Building){ 
                boolean shoot = false;
                
                if(target.within(unit, unit.type.range)){ 
                    unit.aim(target); 
                    shoot = true; 
                }
                unit.controlWeapons(shoot);
            }else if(target == null){
                unit.controlWeapons(false);
            }

            if(target != null){
                if(!target.within(unit, unit.type.range * 0.65f) && target instanceof Building b && b.team == unit.team){ 
                    moveTo(target, unit.type.range * 0.65f);
                }

                unit.lookAt(target);
            }
        }
        
        updateTargeting(){
            Building target = Units.findDamagedTile(unit.team, unit.x, unit.y);

            if(target instanceof ConstructBuild) target = null;

            if(target == null){ 
                super.updateTargeting();
            }else{ 
                this.target = target;
            }
        }
    }      
});